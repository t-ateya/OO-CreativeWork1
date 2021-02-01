package View;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class DataCanvas extends JPanel{
	private DataPanel panel;

	public DataCanvas(DataPanel panel ){
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));

		setBackground(Color.BLACK);
	}
	
}
