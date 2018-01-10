package controller;

import java.util.List;
import pokemon.model.*;
import java.util.ArrayList;
import pokemon.view.PokemonFrame;

public class PokemonController
{
	private List<pokemonModel> pokedex;
	
	public PokemonController()
	{
		pokedex = new ArrayList<pokemonModel>();
		buildPokedex();
	}
	public void buildPokedex()
	{
		pokedex.add(new Stemicon());
		pokedex.add(new Bearagon());
		pokedex.add(new ErrorBugger());
		pokedex.add(new HydoBird());
		pokedex.add(new Infurno());
		pokedex.add(new SpiteRate());
	}
	public List<pokemonModel> getPokedex()
	{
		return pokedex;
		
	}
	public boolean isValidInterger(String input)
	{
		return false;
	}
	public boolean isValidDouble(String input)
	{
		return false;
	}
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for(int index = 0; index < pokedex.size();index++)
		{
			names [index] = pokedex.get(index).getName();
		}
		return names;
	}
	
	
}
