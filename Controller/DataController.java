package Controller;

import Model.DataModel;
import Model.DataModelInterface;
import View.DataView;

public class DataController implements DataControllerInterface {
	private DataView view;
	private DataModelInterface model;

	//View the application's GUI
	@Override
	public void startApplication() {
		view = new DataView();
		view.setVisible(true);

	}

	@Override
	public String getMessage() {
		try {
			model = new DataModel();
			return model.loadData();
		} catch (Exception e) {
			return "There was an error loading data";
		}
		
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


	
}
