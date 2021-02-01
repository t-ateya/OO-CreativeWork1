package Model;

import java.io.IOException;
import java.awt.Graphics2D;

public interface  DataModelInterface {

	String loadData() throws IOException;
	boolean updateData(String data);
	void render(Graphics2D g2);
	
}
