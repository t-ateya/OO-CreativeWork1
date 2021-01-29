package View;

import javax.swing.JFrame;

import Controller.DataController;
import Controller.DataControllerInterface;

public class DataView extends JFrame {
	private DataControllerInterface controller = new DataController();

	
	public DataView(){
		initComponents();
		

	}

	private void initComponents() {
	}
	
}
