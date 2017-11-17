package com.basejava.stuty;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * 使用org.json创建json数组
 * */

public class CreatJson_org_json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject object = new JSONObject();
		
		
		object.put("name", "使用org.json创建json数组");
		object.put("num", 27);
		
		JSONArray array = new JSONArray();
		
		String[] strings= {"Android, Google 搜索, Google 翻译","菜鸟教程, 菜鸟工具, 菜鸟微信","淘宝, 网购"};
		
		JSONObject obj1 = new JSONObject();
		obj1.put("title", "Google");
		obj1.put("info", strings[0]);
		array.put(obj1);
		
		object.put("sites", array);
		
		System.out.println(object.toString());
		
	}

}
