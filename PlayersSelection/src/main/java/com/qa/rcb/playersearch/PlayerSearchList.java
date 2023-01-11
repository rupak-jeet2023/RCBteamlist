package com.qa.rcb.playersearch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PlayerSearchList {

	public static String foreignplayer ="";
	public static String wicketkeeper ="";
	public static int c=0,d=0,countplayer=0,countwk=0;
	
	public static void PlayerSearchList() {
		
		
		JSONParser jsonparser = new JSONParser();
	
		try {
			FileReader reader = new FileReader(".\\JSONfile\\rcbteamlist.json");
			
			JSONObject teamlistreader = (JSONObject) jsonparser.parse(reader);
			
			String playersname = (String) teamlistreader.get("name");
			String playerslocation = (String) teamlistreader.get("location");
			
			 JSONArray teamarray = (JSONArray) teamlistreader.get("player");
			 
			 
			 
			 for(int i=0;i<teamarray.size();i++) {
				 
				 JSONObject player = (JSONObject) teamarray.get(i);
				 
				 String name = (String) player.get("name");
				 String country = (String) player.get("country");
				 String role = (String) player.get("role");
				 
				 if(country.equals("India"))
				 {
					 
				 }
				 else
				 {
					 foreignplayer = foreignplayer + name + " ," ;
					 c++;
					 countplayer=c;
				 }
				 
				 if(role.equalsIgnoreCase("wicket-keeper"))
				 {
					 wicketkeeper = wicketkeeper + name ;
					 d++;
					 countwk=d;
				 }
				 
			 }
			 
			 if(c==0) {
				 
			 }
			 if(d==0) {
				 
			 }
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static String get_foreign_players() {
		return foreignplayer;
	}
	
	public static int get_foreign_players_count() {
		return countplayer;
	}
	
	public static String get_wicket_keeper() {
		return wicketkeeper;
	}
	
	public static int get_wicket_keeper_count() {
		return countwk;
	}
	
	
	
//	public static void main (String args[]) {
//		PlayerSearchList();
//		System.out.println(get_foreign_players()+" "+get_foreign_players_count()+" "+get_wicket_keeper());
//	}
}
