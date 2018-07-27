
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputIntoFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("d:\\UserInput.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		 
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the city :");
		String city=br.readLine();
		
		while(!(city.equalsIgnoreCase("stop")))
		{
				
				bw.write(city);
				System.out.println(city + " is added to the file.");
				System.out.println("Enter the city :");
				city=br.readLine();
		}
		bw.close();
		fw.close();
		
	}

}
