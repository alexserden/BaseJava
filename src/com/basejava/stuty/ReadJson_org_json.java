package com.basejava.stuty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * 使用org.json解析json
 * */

public class ReadJson_org_json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.json"));
			String s = null;
			try {
				while ((s = br.readLine()) != null) {
					JSONObject object = new JSONObject(s);
					System.out.println("name =" + object.getString("name"));
					System.out.println("num =" + object.getInt("num"));
					
					JSONArray array = object.getJSONArray("sites");
					for (int i = 0; i < array.length(); i++) {
						System.out.println("--------");
						JSONObject obj1 = array.getJSONObject(i);
						System.out.println("title =" + obj1.getString("title"));
						System.out.println("info =" + obj1.getJSONArray("info"));	
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
