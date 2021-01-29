package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;;

public class DataModel implements DataInterface {

	@Override
	public String loadData() throws IOException {
		if (!(new File ("file.txt").isFile())){
			Files.createFile(Paths.get("file.txt"));
		}

		String data = null;
		//Let's use a try-with-resource block
		try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
			StringBuilder string = new StringBuilder();
			String line = reader.readLine();
			string.append("<html>");
			while (line !=null){
				string.append(line);
				string.append("<br />");
				line= reader.readLine();
			}
			string.append("</html");
			data = string.toString();
		}catch (Exception ex){
			data = ex.getMessage();
		}
		return data;

	
	}


/*
	@Override
	public void updateData() {
		// TODO Auto-generated method stub

	}
     */	
}
