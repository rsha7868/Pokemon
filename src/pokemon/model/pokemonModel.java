package pokemon.model;
import java.util.List;
import java.util.ArrayList;
public abstract class pokemonModel
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public pokemonModel (int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public String[] getPokemonTypes()
	{
		String [] types = null;
		Class<?> currentClass = this.getClass();
		ArrayList<String> parentType = new ArrayList<String>();
		
		while(currentClass.getSuperclass() != null)
		{
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];
		
			for(int index = 0; index < types.length; index++)
				{
				String currentInterface = 
						pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
				if(!parentType.add(currentInterface))
				{
					parentType.add(currentInterface);
				}
			}
			currentClass = currentClass.getSuperclass();
			
			}
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		
		return types;
	}
	public String toString()
	{
		String description = "Hi, I am a" + ", and my HP is " + healthPoints;
		
		return description;
	}
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints()
	{
		return attackPoints;
	}

	/**
	 * @return the enhancementModifier
	 */
	public double getEnhancementModifier()
	{
		return enhancementModifier;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @param attackPoints the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	/**
	 * @param enhancementModifier the enhancementModifier to set
	 */
	public void setEnhancementModifier(double enhancementModifier)
	{
		this.enhancementModifier = enhancementModifier;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}
}
