package Test;

import java.io.IOException;

import Model.DataModelInterface;
import Model.DataModel;

public class test {
	public static void main(String[] args) throws IOException {
		DataModelInterface model = new DataModel();
		String data = model.loadData();
		//System.out.print(data);

		boolean update = model.updateData("This adivise is for you to work very hard");
		assert(update == true);
		//System.out.print(data);
	
}

}
