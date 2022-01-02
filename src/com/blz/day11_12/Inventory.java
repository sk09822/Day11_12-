package com.blz.day11_12;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory {
	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jsonparser = new JSONParser();

		FileReader reader = new FileReader(".\\Data\\inventory.json");

		Object obj = jsonparser.parse(reader);

		JSONObject invjsonobj = (JSONObject) obj;

		JSONArray array = (JSONArray) invjsonobj.get("Itemlist");

		for (int i = 0; i < array.size(); i++) {

			JSONObject Itemlist = (JSONObject) array.get(i);

			String item_Name = (String) Itemlist.get("item_Name");
			double weight = (double) Itemlist.get("weight");
			double price = (double) Itemlist.get("price");

			System.out.println("Itemlist of ....." + i + " is.. ");
			System.out.println("Item name: " + item_Name);
			System.out.println("weight: " + weight + " kg");
			System.out.println("price: " + price + " Rs/kg");

			double totalAmount = 0;
			double amount = weight * price;
			totalAmount = amount + totalAmount;
			System.out.println("Total Inventary cost is" + totalAmount);
		}

	}

}