package com.testvargrant.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class PlayersPojo implements Serializable
{

	private String name; 
	private String country;
	private String role;
	@JsonAlias("price-in-crores")
	private String priceInCrores;
	
	/**
	 * these are the getters and Setters methods for Players.
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

	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role) 
	{
		this.role = role;
	}
	public String getPriceInCrores() 
	{
		return priceInCrores;
	}
	public void setPriceInCrores(String priceInCrores) 
	{
		this.priceInCrores = priceInCrores;
	}

	/**
	 * overriding the toString() for to return  the players with name,country,role and price.
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", role=" + role + ", priceInCrores=" + priceInCrores + "]";
	}

}
