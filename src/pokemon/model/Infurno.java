package pokemon.model;

public class Infurno extends pokemonModel implements Fire
{
	public Infurno(int number, String name)
	{
		super(number, name);
		setup();
	}
	public Infurno()
	{
		super(14, "Infurno");
		setup();
	}
	public Infurno(String name)
	{
		super(14, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(950);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.95);
		this.setHealthPoints(1893);
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
