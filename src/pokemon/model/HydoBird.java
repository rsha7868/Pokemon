package pokemon.model;

public class HydoBird extends pokemonModel implements Wind
{
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
	public HydoBird(int number, String name)
	{
		super(number, name);
		setup();
	}
	public HydoBird()
	{
		super(13, "HydoBird");
		setup();
	}
	public HydoBird(String name)
	{
		super(13, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(350);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1.45);
		this.setHealthPoints(650);
	}
}
