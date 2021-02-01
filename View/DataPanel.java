package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridLayout;

import java.awt.Container;



public class DataPanel {
	private JFrame window;
	private JButton loadDataButton = new JButton("Load Data");
	private JButton updateDataButton = new JButton("Update Data");
	private JButton quitJButton = new JButton("Quit App");

	private JTextArea myMessage = new JTextArea();

	public DataPanel(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2,1));
	}


	
}
