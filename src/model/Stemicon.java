package model;

public class Stemicon extends pokemonModel implements Dragon, Wind
{
	public Stemicon(int number,String name)
	{
		super(number, name);
	}
	public String moveFlyable()
	{
		return "Hey I'm hovering.";
	}
	public String moveSpit()
	{
		return "Take my liquid boi.";
	}
	public String moveStomp()
	{
		return "You stuck under there?";
	}
	public String moveTornado()
	{
		return "";
	}
	public String moveSteam()
	{
		return "";
	}
	public String moveDisapear()
	{
		return "";
	}
}
