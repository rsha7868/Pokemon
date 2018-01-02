package pokemon.model;

public class ErrorBugger extends Stemicon
{
	public ErrorBugger(int number, String name)
	{
		super(number, name);
		setup();
	}
	public ErrorBugger()
	{
		super(10, "ErrorBugger");
		setup();
	}
	public ErrorBugger(String name)
	{
		super(10, name);
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(1000);
		this.setCanEvolve(false);
		this.setEnhancementModifier(5.95);
		this.setHealthPoints(2058);
	}
}
