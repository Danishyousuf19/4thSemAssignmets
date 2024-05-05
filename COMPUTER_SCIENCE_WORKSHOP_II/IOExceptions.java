import java.io.*;

public class IOExceptions {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\Users\\admin\\Desktop\\danish\\matching.py");
			BufferedReader fileInput = new BufferedReader(file);
			
			for (int counter = 0; counter < 18; counter++)
				System.out.println(fileInput.readLine());
			fileInput.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
