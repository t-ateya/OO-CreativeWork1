package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Model.DataModel;
import Model.DataModelInterface;

public class DataCanvas extends JPanel{
	private DataPanel panel;

	public DataCanvas(DataPanel panel ){
		this.panel = panel;
		setPreferredSize(new Dimension(250, 250));
		setBackground(Color.BLACK);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D)g;
		DataModel d = new DataModel();
		//d.getData();
		//d.render(g2);
	}
}
