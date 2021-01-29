package Main;

import Controller.DataController;
import Controller.DataControllerInterface;

public class AppDriver {

	public static void  main(String[] args){
		DataControllerInterface controller = new DataController();
		controller.startApplication();
	
}
}
