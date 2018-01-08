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

public class PokemonPanel extends JPanel
{
	public PokemonPanel() {
	}
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthlabel;
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
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		healthlabel = new JLabel ("");
		attackLabel = new JLabel ("");
		nameLabel = new JLabel ("");
		numberLabel = new JLabel ("");
		evolvableLabel = new JLabel ("");
		modifierLabel = new JLabel ("");
		
		iconLabel = new JLabel("",new ImageIcon(getClass().getResource("/pokemon/images/logo.png")), JLabel.CENTER);
		
		
		evolvableBox = new JCheckBox ("");
		nameField = new JTextField ("");
		numberField = new JTextField ("");
		attackField = new JTextField ("");
		healthField = new JTextField ("");
		modifierField = new JTextField ("");
		
		descriptionArea = new JTextArea ("");
		typeArea = new JTextArea ("");
		
		saveButton = new JButton ("");
		clearButton = new JButton ("");
		pokedexDropdown = new JComboBox ("");
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupLayout();
		setupPanel();
		setupListener();
		
	
	}
	public void setupPanel()
	{
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel poekemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdrown.setModel(pokemonModel);
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
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		if(Types.length > 1)
		{
			
		}
	}
	private void setupListeners()
	{
		pokedexDropdown.addActionListener( new ActionListener())
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokemonInfo(selectedPokemonIndex);
				updateImage();
				updateTyoePanels()
				repaint();
			}
		});
	}
}
