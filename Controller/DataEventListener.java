package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import View.DataPanel;

import View.MenuScreen;

public class DataEventListener implements ActionListener {
	private DataPanel panel;

	public DataEventListener(DataPanel panel){
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton button = (JButton)e.getSource();
		
		if (button == panel.getExitButton()){
			panel.getWindow().getContentPane().removeAll();
			var menu = new MenuScreen(panel.getWindow());
			menu.init();
			panel.getWindow().pack();
			panel.getWindow().revalidate();

		} else if (button == panel.getLoadDataButton()){
			panel.getCanvas().repaint();
		}else if (button == panel.getUpdateDataButton()){
			
			String message = panel.getMyMesssageArea().getText();
			if (message.equals("")){
				JOptionPane.showMessageDialog(panel.getWindow(), "No data typed yet" + "\n Type Data to update");
			}else {
				DataController data = new DataController();
				data.writeMessage(message);
			}
			panel.getMyMesssageArea().setText("");
			
			

			
			
		}

	}

	
	
}
