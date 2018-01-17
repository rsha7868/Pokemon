package controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import pokemon.model.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


import pokemon.model.pokemonModel;

public class FileController
{
	public static void savePokemonToFile(ArrayList<pokemonModel> pokedex)
	{
		File saveFile = new File ("Saved Pokedex.txt");
		try
		{
			
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			for (int index = 0; index < pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumber();
				int attack = pokedex.get(index).getAttackPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evlove = pokedex.get(index).isCanEvolve();
				double row = name + ","+ number + "," + health + "," + attack + "," + modify + "," + evolve + ",";
				writeToDisk.println(row);
			}
			writeToDisk.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There was an error;" + error.getMessage());
		}
	}
	public static String readPokemonFromFile()
	{
	String contents = "";
	String path = "Saved Pokedex.txt";
	try
	{
		Scanner fileScanner = new Scanner(new File(path));
		while (fileScanner.hasNextLine())
		{
			String row = fileScanner.nextLine();
			contents +=	row + "\n";
		}
		fileScanner.close();
	}
	catch (FileNotFoundException error)
	{
		System.out.println("There was an error:" + error.getMessage());
	}
	return contents;
	}
}
