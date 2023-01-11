package com.qa.rcb.playersearchtest;

import org.testng.annotations.Test;

import com.qa.rcb.playersearch.PlayerSearchList;

public class PlayerSearchTest extends PlayerSearchList
{
	static PlayerSearchList playersearchlist;
	
	@Test
	public static void foreignPlayersname() {
		playersearchlist.PlayerSearchList();
		System.out.println("The number of the foreign players in RCB team are: " + playersearchlist.get_foreign_players_count());
		System.out.println("The name of the foreign players in RCB team are: " + playersearchlist.get_foreign_players());
		
	}
	
	@Test
	public static void wicketkeeperssname() {
		System.out.println("There are "+playersearchlist.get_wicket_keeper_count()+" wicket keeper present in the team and the names are "+playersearchlist.get_wicket_keeper());
		
	}
	
	
	
}
