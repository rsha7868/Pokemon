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
}
