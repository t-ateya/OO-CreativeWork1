package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;



public class DataPanel {
	private JFrame window;
	private DataCanvas canvas;
	private JButton loadDataButton = new JButton("Load Data");
	private JButton updateDataButton = new JButton("Update Data");
	private JButton quitButton = new JButton("Quit App");

	
	private JTextArea myMessage = new JTextArea();

	public DataPanel(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2,1));
		cp.add(BorderLayout.SOUTH, southPanel);

		JPanel south1 = new JPanel();
		//south1.add(new JLabel("Type Data Here: "));
		
		//south1.add(myMessage);
		southPanel.add(south1);

		JPanel south2 = new JPanel();
		south2.add(loadDataButton);
		south2.add(updateDataButton);
		south2.add(quitButton);
		southPanel.add(south2);

		//Create a Canvas
		canvas = new DataCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);

		//DataButtonListener listener = new DataButtonListener(this);
		
	}

	public JButton getLoadDataButton(){
		return loadDataButton;
	}

	public JButton getUpdateDataButton(){
		return updateDataButton;
	}

	public JButton getQuitButton(){
		return quitButton;
	}

	public DataCanvas getCanvas(){
		return canvas;
	}
	



	
}
