package Model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataModel implements DataModelInterface{
	private String data;

	
	public String loadData() throws FileNotFoundException, IOException {
		if (!(new File("file.txt").isFile())) {
			System.out.println("File does not exits-I am creating the file");
			Files.createFile(Paths.get("file.txt"));
		}

		//String data = null;
		// Let's use a try-with-resource block
		try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
			StringBuilder string = new StringBuilder();
			String line = reader.readLine();
			string.append("<html>\n");
			while (line != null) {
				string.append(line);
				string.append(" <br />\n");
				line = reader.readLine();
			}
			string.append("\n</html>");
			data = string.toString();
		} catch (Exception ex) {
			data = ex.getMessage();
		}
		return data;

	}

	
	public boolean updateData(String data) {

		// Save data to the file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
			writer.write(data);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	
	public String getData() {
		return data;
	}

	
	public void render(Graphics2D g2) {
		g2.setColor(Color.yellow);
		g2.setFont(new Font("Courier", Font.BOLD, 14));
		g2.drawString(getData(), 50, 100);

	}



     
}
