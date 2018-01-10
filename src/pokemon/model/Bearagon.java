package pokemon.model;

public class Bearagon extends pokemonModel implements Dragon
{
	public Bearagon(int number, String name)
	{
		super(number, name);
		setup();
	}
	public Bearagon()
	{
		super(12, "Bearagon");
		setup();
	}
	public Bearagon(String name)
	{
		super(12, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(100);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.61);
		this.setHealthPoints(459);
		
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
}
