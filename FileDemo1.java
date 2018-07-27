import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("d:\\MyFile1");
		
		boolean created=f.createNewFile();
		
		if(created==true)
		{
			System.out.println("The file has been created.");
		}
		else
		{
			System.out.println("The file is not created.");
		}
		
		File fl=new File("d:\\MyFolder1");
		
		boolean status=fl.mkdir();
		
		if(status==true)
		{
			System.out.println("The folder has been created.");
		}
		else
		{
			System.out.println("The folder was not created.");
		}

	}

}
