package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Controller.DataEventListener;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;

public class DataPanel {
	private JFrame window;
	private DataCanvas canvas;
	private JButton loadDataButton = new JButton("Load Data");
	private JButton updateDataButton = new JButton("Update Data");
	private JButton exitButton = new JButton("Exit");
	private JScrollPane jScrollPanel = new JScrollPane();

	
	private JTextArea myMessageaArea = new JTextArea();

	public DataPanel(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2,1));
		cp.add(BorderLayout.SOUTH, southPanel);

		JPanel south1 = new JPanel();
		south1.add(new JLabel("Type Data Here: "));
		
		myMessageaArea.setColumns(20);
		myMessageaArea.setRows(5);
		jScrollPanel.setViewportView(myMessageaArea);
		
		//south1.add(myMessageaArea);
		south1.add(jScrollPanel);
		southPanel.add(south1);

		JPanel south2 = new JPanel();
		south2.add(loadDataButton);
		south2.add(updateDataButton);
		south2.add(exitButton);
		southPanel.add(south2);

		//Create a Canvas
		canvas = new DataCanvas(this);
		canvas.removeAll();
		cp.add(BorderLayout.CENTER, canvas);

		DataEventListener listener = new DataEventListener(this);
		loadDataButton.addActionListener(listener);
		updateDataButton.addActionListener(listener);
		exitButton.addActionListener(listener);
		
	}

	public JButton getLoadDataButton(){
		return loadDataButton;
	}

	public JButton getUpdateDataButton(){
		return updateDataButton;
	}

	public JButton getExitButton(){
		return exitButton;
	}

	public DataCanvas getCanvas(){
		return canvas;
	}

	public JFrame getWindow(){
		return window;
	}

	public JScrollPane getJScrollPane(){
		return jScrollPanel;
	}

	public JTextArea getMyMesssageArea(){
		return myMessageaArea;
	}
	



	
}
