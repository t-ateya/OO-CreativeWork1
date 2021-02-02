package Controller;

import java.io.IOException;


public interface DataControllerInterface {
	
	String getMessage() throws IOException;
	boolean writeMessage(String message);
	
}
