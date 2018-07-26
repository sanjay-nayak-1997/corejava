import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos=new FileOutputStream("d:\\newFile.txt");
		
		fos.write('H');
		fos.write('E');
		fos.write('L');
		fos.write('L');
		fos.write('O');
		
		fos.close();
		System.out.println("The file was created successfully!");
		
		FileOutputStream fos1=new FileOutputStream("d:\\newFile1.txt");
		
		DataOutputStream dos=new DataOutputStream(fos1);
		
		dos.writeBytes("Hello World !");
		
		dos.close();
		fos.close();
		
		FileWriter fw=new FileWriter("d:\\newFile1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("First Line");
		bw.newLine();
		bw.write("Second line");
		bw.close();
		fw.close();
		
	}

}
