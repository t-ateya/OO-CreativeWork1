package Main;

import javax.swing.JFrame;

import View.MenuScreen;

public class main {
	public static void main(String[]args){
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(400, 100);
		window.setTitle("Load and Update Data Menu");

		var menu = new MenuScreen(window);
		menu.init();
		window.pack();
		window.setVisible(true);
	}
	
}
