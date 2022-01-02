package com.blz.day11_12;

import java.io.IOException;
import java.text.ParseException;

public class StockAccount {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jsonparser = new JSONParser();

		FileReader reader = new FileReader(".\\Data\\stock.json");

		Object object = jsonparser.parse(reader);

		JSONObject stockjsonobj = (JSONObject) object;

		JSONArray stock_array = (JSONArray) stockjsonobj.get("StockDetails");

		for (int i = 0; i < stock_array.size(); i++) {

			JSONObject StockDetails = (JSONObject) stock_array.get(i);

			String stock_Name = (String) StockDetails.get("stock_Name");
			double number_Of_Share = (double) StockDetails.get("number_Of_Share");
			double share_Price = (double) StockDetails.get("share_Price");

			System.out.println("Stock Details of ....." + i + " is.. ");
			System.out.println("Stock Name: " + stock_Name);
			System.out.println("Number Of Share: " + number_Of_Share);
			System.out.println("Share Price: " + share_Price);

			double totalValue = 0;
			double amount = number_Of_Share * share_Price;
			totalValue = amount + totalValue;
			System.out.println("Total Vlaue is" + totalValue);
		}

	}

}
