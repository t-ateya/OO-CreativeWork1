package Controller;

import Model.DataModel;
import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;

public class DataController implements DataControllerInterface {
	private String message = null;
	
	private DataModel model = new DataModel();

	@Override
	public String getMessage(){
		
		try {
			message = model.loadData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public boolean writeMessage(String message) {
		try {
			model = new DataModel();
			return model.updateData(message);

		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	
	}

	public void render(Graphics2D g2)  {
		g2.setColor(Color.yellow);
		g2.setFont(new Font("Courier", Font.BOLD, 20));
		g2.drawString(getMessage(), 50, 100);
	}

	


	
}
