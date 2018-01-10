package pokemon.model;

public class SpiteRate extends pokemonModel implements Dragon, Wind, Fire
{
	public SpiteRate(int number, String name)
	{
		super(number, name);
		setup();
	}
	public SpiteRate()
	{
		super(11, "SpiteRate");
		setup();
	}
	public SpiteRate(String name)
	{
		super(11, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(950);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.95);
		this.setHealthPoints(1893);
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
	public String moveLaserBlast()
	{
		return "Who is the hot Shot";
	}
	public String moveVolcano()
	{
		return "Volcanic the World";
	}
	public String moveBurn()
	{
		return "Burn child Burn";
	}
}
