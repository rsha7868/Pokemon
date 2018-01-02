package view;

import javax.swing.JTextField;

import controller.PokemonController;

public class PokemonPanel exends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthlabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolveableBox;
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
}
private void updatePokedexInfo(int index)
{
	nameField.setText(appController.getPokedex()get(index).getName());
	evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
	number
}
