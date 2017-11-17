package com.basejava.stuty;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * 使用gson创建json数组
 * */

public class CreatJson_gson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonObject object = new JsonObject();
		object.addProperty("name", "创建JSON");
		object.addProperty("num", "27");
		
		JsonArray array = new JsonArray();
		
		String[] strings = {"淘宝, 网购"};
		
		JsonObject obj1 = new JsonObject();
		obj1.addProperty("title", "Google");
		obj1.addProperty("info", "Android, Google 搜索, Google 翻译");
		array.add(obj1);
		
		JsonObject obj2 = new JsonObject();
		obj2.addProperty("title", "Runoob");
		obj2.addProperty("info", "菜鸟教程, 菜鸟工具, 菜鸟微信");
		array.add(obj2);
		
		JsonObject obj3 = new JsonObject();
		obj3.addProperty("title", "Taobao");
		obj3.addProperty("info", "淘宝, 网购");
		array.add(obj3);
		
		object.add("sites", array);
		
		System.out.println(object.toString());
		
	}

}
