package com.epsi.tower_defense;

import org.json.JSONArray;
import org.json.JSONObject;

public class Plateau {
	
	//Case[][] terrain;
	
	public Plateau(String path) {
		
		JSONObject obj = new JSONObject(path);
		

		JSONArray arr = obj.getJSONArray("terrain");
		for (int i = 0; i < arr.length(); i++)
		{
		    System.out.println(arr.getInt(i));
		}
	}
}
