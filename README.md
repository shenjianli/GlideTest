## Glide图片加载库的使用实例

在泰国举行的谷歌开发者论坛上，谷歌为我们介绍了一个名叫 Glide 的图片加载库，作者是bumptech。这个库被广泛的运用在google的开源项目中，包括2014年google I/O大会上发布的官方app。

Glide Github 地址：
[https://github.com/shenjianli/glide](https://github.com/shenjianli/glide)

Glide效果图：
![glide](img/glide_test.png)

其中代码结构和Picasso的使用实例十分相似，具体的代码逻辑与结构请参考[Picasso使用实例](http://shenjianli.github.io/2016/05/27/Picasso-Text-Example/)


全面学习Glide可移步--->[http://mrfu.me/2016/02/27/Glide_Getting_Started/](http://mrfu.me/2016/02/27/Glide_Getting_Started/)


下面来说明一下存在的问题：
1.有的图片第一次加载的时候只显示占位图，第二次才显示正常的图片呢
如果你刚好使用了这个圆形Imageview库或者其他的一些自定义的圆形Imageview，而你又刚好设置了占位的话，那么，你就会遇到第一个问题。如何解决呢？
方案一: 不设置占位；
方案二：使用Glide的Transformation API自定义圆形Bitmap的转换。这里是一个已有的例子；
方案三：使用下面的代码加载图片：
```
Glide.with(mContext)
    .load(url) 
    .placeholder(R.drawable.loading_spinner)
    .into(new SimpleTarget<Bitmap>(width, height) {
        @Override 
        public void onResourceReady(Bitmap bitmap, GlideAnimation anim) {
            // setImageBitmap(bitmap) on CircleImageView 
        } 
    };
```

2.我总会得到类似You cannot start a load for a destroyed activity这样的异常呢
请记住一句话：不要再非主线程里面使用Glide加载图片，如果真的使用了，请把context参数换成getApplicationContext。

3.我不能给加载的图片setTag()呢
是因为你使用的姿势不对哦。如何为ImageView设置Tag呢？且听我细细道来。
方案一：使用setTag(int,object)方法设置tag,具体用法如下：
Java代码是酱紫的：
```
Glide.with(context).load(urls.get(i).getUrl()).fitCenter().into(imageViewHolder.image);
        imageViewHolder.image.setTag(R.id.image_tag, i);
        imageViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
                int position = (int) v.getTag(R.id.image_tag);
                Toast.makeText(context, urls.get(position).getWho(), Toast.LENGTH_SHORT).show();
            }
        });
```

同时在values文件夹下新建ids.xml，添加
<item name="image_tag" type="id"/>
大功告成!
方案二：从Glide的3.6.0之后，新添加了全局设置的方法。具体方法如下：
先实现GlideMoudle接口，全局设置ViewTaget的tagId:
public class MyGlideMoudle implements GlideModule{
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        ViewTarget.setTagId(R.id.glide_tag_id);
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
同样，也需要在ids.xml下添加id
<item name="glide_tag_id" type="id"/>
最后在AndroidManifest.xml文件里面添加
<meta-data
    android:name="com.yourpackagename.MyGlideMoudle"
    android:value="GlideModule" />
又可以愉快的玩耍了，嘻嘻`(∩_∩)′。
方案三：写一个继承自ImageViewTaget的类，复写它的get/setRequest方法。
```
Glide.with(context).load(urls.get(i).getUrl()).fitCenter().into(new ImageViewTarget<GlideDrawable>(imageViewHolder.image) {
            @Override
            protected void setResource(GlideDrawable resource) {
                imageViewHolder.image.setImageDrawable(resource);
            }

            @Override
            public void setRequest(Request request) {
                imageViewHolder.image.setTag(i);
                imageViewHolder.image.setTag(R.id.glide_tag_id,request);
            }

            @Override
            public Request getRequest() {
                return (Request) imageViewHolder.image.getTag(R.id.glide_tag_id);
            }
        });

        imageViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                Toast.makeText(context, urls.get(position).getWho(), Toast.LENGTH_SHORT).show();
            }
        });
```
## Glide使用技巧

1.Glide.with(context).resumeRequests()和 Glide.with(context).pauseRequests()
当列表在滑动的时候，调用pauseRequests()取消请求，滑动停止时，调用resumeRequests()恢复请求。这样是不是会好些呢？
2.Glide.clear()
当你想清除掉所有的图片加载请求时，这个方法可以帮助到你。
3.ListPreloader
如果你想让列表预加载的话，不妨试一下ListPreloader这个类。

## 一些基于Glide的库

1.glide-transformations（[https://github.com/wasabeef/glide-transformations](https://github.com/wasabeef/glide-transformations)）
一个基于Glide的transformation库，拥有裁剪，着色，模糊，滤镜等多种转换效果，赞的不行不行的~~
2.GlidePalette [https://github.com/florent37/GlidePalette](https://github.com/florent37/GlidePalette)
一个可以在Glide加载时很方便使用Palette的库。
