package pokemon.view;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import controller.PokemonController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.*;

import controller.PokemonController;
import java.awt.FlowLayout;

public class PokemonPanel extends JPanel
{
	
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;

	private void updatePokedexInfo(int index)
	{
	nameField.setText(appController.getPokedex().get(index).getName());
	evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
	numberField.setText(appController.getPokedex().get(index).getNumber() + "");
	attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
	healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
	modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	
	descriptionArea.setText(appController.getPokedex().get(index).toString());
	typeArea.setText("");
	
	for(String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		healthLabel = new JLabel ("");
		attackLabel = new JLabel ("");
		nameLabel = new JLabel ("");
		numberLabel = new JLabel ("");
		evolvableLabel = new JLabel ("");
		modifierLabel = new JLabel ("");
		
		iconLabel = new JLabel("",new ImageIcon(getClass().getResource("/pokemon/images/logo.png")), JLabel.CENTER);
		
		
		evolvableBox = new JCheckBox ("");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 213, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 0, SpringLayout.WEST, healthLabel);
		nameField = new JTextField ("");
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -26, SpringLayout.EAST, this);
		numberField = new JTextField ("");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -20, SpringLayout.WEST, nameField);
		attackField = new JTextField ("");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -31, SpringLayout.WEST, numberField);
		healthField = new JTextField ("");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -34, SpringLayout.WEST, attackField);
		modifierField = new JTextField ("");
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, -36, SpringLayout.WEST, healthField);
		
		descriptionArea = new JTextArea ("");
		typeArea = new JTextArea ("");
		
		saveButton = new JButton ("");
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 21, SpringLayout.WEST, this);
		clearButton = new JButton ("");
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 29, SpringLayout.SOUTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, healthLabel);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -423, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 6, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 10, SpringLayout.WEST, this);
		
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, 0, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, firstType, -103, SpringLayout.WEST, modifierField);
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupLayout();
		setupPanel();
		setupListeners();
		setupComboBox();
		setupTypePanels();
		
	
	}
	public void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.setLayout(appLayout);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50,50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		firstType.setBackground(Color.WHITE);
		secondType.setBackground(Color.WHITE);
		if(types[0].equals("Wind"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else if(types[0].equals("Fire"))
		{
			firstType.setBackground(Color.RED);
		}
		else if(types[0].equals("Dragon"))
		{
			firstType.setBackground(Color.BLACK);
		}
		if(types.length > 1)
		{
			if(types[0].equals("Wind"))
			{
				secondType.setBackground(Color.GRAY);
			}
			else if(types[0].equals("Fire"))
			{
				secondType.setBackground(Color.RED);
			}
			else if(types[0].equals("Dragon"))
			{
				secondType.setBackground(Color.BLACK);
			}
		}
	
	}
	public void setupLayout()
	{
		
	}
	private void updateImage()
	{
		String path = "/pokemon/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
			{
				pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
			}
			catch (NullPointerException missingImageFile)
			{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
			}
			iconLabel.setIcon(pokemonIcon);
	}
	
	private void setupListeners()
		{
			pokedexDropdown.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent selection)
				{
					int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
					updatePokedexInfo(selectedPokemonIndex);
					updateImage();
					updateTypePanels();
					repaint();
				}
			});
		saveButton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent click)
		{
			if(appController.isValidInterger(attackField.getText()) && appController.isValidInterger(healthField.getText())
					&& appController.isValidDouble(modifierField.getText()))
			{
				int selected = pokedexDropdown.getSelectedIndex();
				int health = Integer.parseInt(healthField.getText());
				int attack = Integer.parseInt(attackField.getText());
				double modifier = Double.parseDouble(modifierField.getText());
				String name = nameField.getText();
				boolean evolvable = evolvableBox.isSelected();
				
				appController.updateSelected(selected, health, attack, evolvable, modifier, name);
			}
		}
		
		});
	}
}
