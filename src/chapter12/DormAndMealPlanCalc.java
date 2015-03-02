package chapter12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**Paul Steimel
 * Chapter 12
 * Programming Challenge 3
 *
 */

public class DormAndMealPlanCalc extends JFrame {

	//Fields to hold the rates for calculation
	private final double[] DORMITORIES = {1500, 1600, 1200, 1800};
	private final double[] MEAL_PLANS = {560, 1095, 1500};
	
	//Panels to hold the components
	private JPanel dormitoryPanel;
	private JPanel mealPlanPanel;
	private JPanel selectedCombinationPanel;
	
	//Label
	private JLabel selectLabel;
	
	//Text field for selection result
	private JTextField selectedResults;
	
	//Two combo boxes
	private JComboBox<String> dormitoryCombo;
	private JComboBox<String> mealPlanCombo;
	
	//Two strings for the combo boxes
	private String[] dormitoryString = {
			"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"
	};
	
	private String[] mealPlanString = {
			"7 Meals per Week", "14 Meals per Week", "Unlimited Meals"
	};
	
	
	/**
	 * 
	 * Constructor
	 */
	
	public DormAndMealPlanCalc(){
		
		//Title
		super("Dormitory and Meal Plan Calculator");
		
		//Closing behavior
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the panels
		buildDormitoryPanel();
		buildMealPlanPanel();
		buildSelectedCombinationPanel();
		
		//Add the panels to the content pane.
		add(dormitoryPanel, BorderLayout.NORTH);
		add(mealPlanPanel, BorderLayout.CENTER);
		add(selectedCombinationPanel, BorderLayout.SOUTH);
		
		//pack and make visible
		pack();
		setVisible(true);
	}

	//Combo Box Panel for Dormitories
	private void buildDormitoryPanel(){
		
		dormitoryPanel = new JPanel();
		
		dormitoryCombo = new JComboBox<>(dormitoryString);
		
		dormitoryCombo.addActionListener(new ComboBoxListener());
		
		dormitoryPanel.add(dormitoryCombo);
	}
			
	//Combo Box for Meal Plans
	private void buildMealPlanPanel(){
		
		mealPlanPanel = new JPanel();
		
		mealPlanCombo = new JComboBox<>(mealPlanString);
		
		mealPlanCombo.addActionListener(new ComboBoxListener());
		
		mealPlanPanel.add(mealPlanCombo);
	}
	
	//Panel for the result
	private void buildSelectedCombinationPanel(){
		
		selectedCombinationPanel = new JPanel();
		
		selectLabel = new JLabel("Amount per Semester: $");
		
		selectedResults = new JTextField(8);
		selectedResults.setEditable(false);
		
		selectedCombinationPanel.add(selectLabel);
		selectedCombinationPanel.add(selectedResults);	
	}
	
	//Class for handling the events
	private class ComboBoxListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			double selectedAmount; //result of calculation
			
			//Create a DecimalFormat object to format output
			DecimalFormat dollar = new DecimalFormat("#,##0.00");
			
			//Calculate the amount
			selectedAmount = DORMITORIES[dormitoryCombo.getSelectedIndex()] 
					+ MEAL_PLANS[mealPlanCombo.getSelectedIndex()];
			
			//Display the result
			selectedResults.setText(dollar.format(selectedAmount));
		}
		
	}
	
	
	//The main method creates an instance of DormAndMealPlanCalc class.
	public static void main(String[] args) {
		
		new DormAndMealPlanCalc();
		

	}

}
