package model;

public class errorBugger extends pokemonModel implements Wind
{
	public errorBugger(int number, String name)
	{
		super(number, name);
	}
	public String moveTornado()
	{
		return "To the Skies.";
	}
	public String moveSteam()
	{
		return "Time to release Steam.";
	}
	public String moveDisapear()
	{
		return "You Can't See Me!!!";
	}
}
