package controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import pokemon.model.*;

import pokemon.model.pokemonModel;

public class FileController
{
	pulbic static void savePokemonToFile(ArrayList<pokemonModel> pokedex)
	{
		File saveFile = new File ("Saved Pokedex.txt");
		try
		{
			
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			for (int index = 0; index < pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumebr();
				int attack = pokedex.get(index).getAttackPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evlove = pokedex.get(index).isCanEvolve();
				double row = name + ","+ health + "," + "," + modify + "," + evolve;
				writeToDisk.println(row);
			}
			writeToDisk.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.printlm("There was an error;" + error.getMessage);
		}
	}
}
