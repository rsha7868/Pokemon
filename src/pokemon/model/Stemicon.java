package pokemon.model;

public class Stemicon extends pokemonModel implements Dragon, Wind
{
	public Stemicon(int number,String name)
	{
		super(number, name);
		setup();
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
	public Stemicon()
	{
		super(9, "Stemicon");
		setup();
	}
	public Stemicon(String name)
	{
		super(9, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(425);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.47);
		this.setHealthPoints(294);
	}
}
