package Model;

import java.io.IOException;

public interface  DataModelInterface {

	String loadData() throws IOException;
	boolean updateData(String data);
	
}
