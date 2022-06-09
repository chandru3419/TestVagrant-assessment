package com.testvargrant.pojo;

import java.io.Serializable;
import java.util.List;

public class TeamPojo implements Serializable
{
	private String name;
	private String location;
	private List<PlayersPojo> player;
	
	/**
	 *  these are the getters and Setters methods for Players in the RCB team.
	 * @return
	 */
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public List<PlayersPojo> getPlayer() 
	{
		return player;
	}
	public void setPlayer(List<PlayersPojo> player) 
	{
		this.player = player;
	}
	
}
