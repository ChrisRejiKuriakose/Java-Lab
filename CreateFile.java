import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
	public static void main(String args []) {
		String data = "this is a test input file";
		FileWriter input = null;
		try
		{
			input = new FileWriter("input.txt");
			input.write(data); 
			input.flush();
			input.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}