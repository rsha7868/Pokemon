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
		return "The wind is too powerful.";
	}
	public String moveSteam()
	{
		return "Why is it so hot in here.";
	}
	public String moveDisapear()
	{
		return "You can't see me.";
	}
}
