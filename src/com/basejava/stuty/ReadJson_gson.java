package com.basejava.stuty;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * 使用gson解析json
 * */

public class ReadJson_gson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//创建json解析器,可以使用解析器来解析字符串或者输入流
			JsonParser parser = new JsonParser();
			//创建json对象读取json文件
			JsonObject object = (JsonObject) parser.parse(new FileReader("Read.json"));
			
			System.out.println("name = " + object.get("name").getAsString());
			System.out.println("num = " + object.get("num").getAsInt());
			
			//获取json数组信息
			JsonArray array = object.get("sites").getAsJsonArray();
			//循环从数组中取数据
			for (int i = 0; i < array.size(); i++) {
				System.out.println("-----------");
				JsonObject subobj = array.get(i).getAsJsonObject();
				System.out.println("title = " + subobj.get("title").getAsString());
				System.out.println("info = " + subobj.get("info").getAsJsonArray());
				
//				JsonArray arr = subobj.get("info").getAsJsonArray();
//				ArrayList<String> arrayList = new ArrayList<String>();
//				for (int j = 0; j < arr.size(); j++) {
//					arrayList.add(arr.getInt(j));
//				}
				
			}
			
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
