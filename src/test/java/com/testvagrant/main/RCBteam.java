package com.testvagrant.main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testvargrant.pojo.PlayersPojo;
import com.testvargrant.pojo.TeamPojo;

public class RCBteam
{
	/**
	 * this methods will validate the RCB team with only 4 foreign players and  at least one Wicket-keeper in the team.
	 * @param players
	 * @return boolean
	 */
	
	public static boolean validateForeign(List<PlayersPojo> players)
	{
		//this loop for checking the only 4  foreign players in the team.
		int foreignPlayerCount=0;
		for (PlayersPojo allPlayers : players)
		{
			if(!allPlayers.getCountry().equals("India"))
			{
				foreignPlayerCount++;
			}
		}
		
		return foreignPlayerCount==4;
	}
	
	public static boolean wk(List<PlayersPojo> players)
	{
		//this loop for checking  at least one wicket-keeper in the team
		int wkCount=0;
		for (PlayersPojo wkp : players) 
		{
		if(wkp.getRole().equals("Wicket-keeper"))
		 	{
			 wkCount++;
		 	}
		}
		return wkCount==1;
	}
	
	@Test
	public static void validateRcbTeam() throws Throwable, Throwable, IOException
	{
		//created objectMapper object to do Deserialization.
		ObjectMapper mapper = new ObjectMapper();
		
		//reading the json data from teamData.json file and converting it to java object
		TeamPojo team = mapper.readValue(new File("./Document/teamData.json"), TeamPojo.class);
		List<PlayersPojo> player = team.getPlayer();
		
		//validating the team RCB with assertions.
		Assert.assertTrue(validateForeign(player));
		Assert.assertTrue(wk(player));
		System.out.println("The team RCB is validated with only 4 foreign players and at least one Wicket-keeper in the team.");
		
		
	}

}
