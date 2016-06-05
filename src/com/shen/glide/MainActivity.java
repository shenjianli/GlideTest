package com.shen.glide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {
	//设置图片请求的基础地址
	private static final String BASE_URL = "http://img1.3lian.com/img2011/w1/106/85/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//创建一组数据用来填充ListView时在界面显示数据
		ArrayList<Product> dishList = new ArrayList<Product>();
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		dishList.add(new Product(BASE_URL + "42.jpg", "水煮鱼片", "38.00"));
		dishList.add(new Product(BASE_URL + "34.jpg", "小炒肉", "18.00"));
		dishList.add(new Product(BASE_URL + "37.jpg", "清炒时蔬", "15.00"));
		dishList.add(new Product(BASE_URL + "11.jpg", "金牌烤鸭", "36.00"));
		dishList.add(new Product(BASE_URL + "12.jpg", "粉丝肉煲", "20.00"));
		
		//获取ListView组件并设置数据适配器
		ListView mListView = (ListView) this.findViewById(R.id.listview);
		ProductListViewAdapter adapter = new ProductListViewAdapter(dishList);
		mListView.setAdapter(adapter);
	}

	// ListView适配器
	private class ProductListViewAdapter extends BaseAdapter {

		private ArrayList<Product> dataList;

		public ProductListViewAdapter(ArrayList<Product> list) {
			this.dataList = list;
		}

		@Override
		public int getCount() {
			return dataList.size();
		}

		@Override
		public Object getItem(int position) {
			return dataList.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ListViewItemHolder item = null;
			//加载ListView中每项的布局文件
			if (convertView == null) {
				convertView = LayoutInflater.from(MainActivity.this).inflate(
						R.layout.product_listview_item, null);
				item = new ListViewItemHolder();
				item.imgIv = (ImageView) convertView
						.findViewById(R.id.imageView1);
				item.nameTv = (TextView) convertView
						.findViewById(R.id.textView1);
				item.priceTv = (TextView) convertView
						.findViewById(R.id.textView2);

				convertView.setTag(item);
			} else {
				item = (ListViewItemHolder) convertView.getTag();
			}

			Product product = dataList.get(position);

			//这里就是异步加载网络图片的地方
			Glide.with(MainActivity.this).load(product.getImgUrl()).transform(new GlideCircleTransform(MainActivity.this))
					.into(item.imgIv);

			item.nameTv.setText(product.getName());
			item.priceTv.setText(product.getPrice() + "元");

			return convertView;
		}

	}

	// ListView的Item组件类
	private class ListViewItemHolder {
		ImageView imgIv;
		TextView nameTv;
		TextView priceTv;
	}
}
