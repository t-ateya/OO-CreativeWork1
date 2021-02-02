package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Controller.DataController;

public class DataCanvas extends JPanel {

	private static final long serialVersionUID = 1L;
	private DataPanel panel;

	public DataCanvas(DataPanel panel) {
		this.setPanel(panel);
		setPreferredSize(new Dimension(800, 500));
		setBackground(Color.BLACK);
	}

	public DataPanel getPanel() {
		return panel;
	}

	public void setPanel(DataPanel panel) {
		this.panel = panel;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		DataController dc = new DataController();
		dc.render(g2);
	}
}
