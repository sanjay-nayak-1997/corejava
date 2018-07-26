import java.io.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class FileReadDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("src/Hello.txt");
		
		int x=fis.read();
		while(x!=-1)
		{
			System.out.print((char)x);
			x=fis.read();
		}
		fis.close();
		
		System.out.println();
		System.out.println();
		FileReader fr=new FileReader("src/Hello.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		int flag=0;
		while(line!=null)
		{
			System.out.println(line);
			
			line=br.readLine();
		}
	}

}
