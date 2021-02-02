package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {
	private JFrame window;

	public MenuScreen(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		JPanel menuPanel = new JPanel();
		menuPanel.setPreferredSize(new Dimension(500, 500));

		JButton loadAndUpdateDataButton = new JButton("Load and Update Data");
		menuPanel.add(loadAndUpdateDataButton);

		cp.add(BorderLayout.CENTER, menuPanel);

		loadAndUpdateDataButton.addActionListener(event->{
			window.getContentPane().removeAll();
			var panel = new DataPanel(window);
			panel.init();
			window.pack();
			window.revalidate();
		});
	}

	public JFrame getWindow(){
		return window;
	}
	
}
