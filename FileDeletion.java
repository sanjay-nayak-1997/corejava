import java.io.File;
import java.io.IOException;

public class FileDeletion {

	public static void main(String[] args) throws IOException {

		File f=new File("d:\\MyFile");
		
		if(f.exists()==true)
		{
			System.out.println("The file exists");
			boolean deleted=f.delete();
			if(deleted=true)
			{
				System.out.println("The file has been deleted.");
			}
			else
			{
				System.out.println("Error");
			}
		}
		else
		{
			System.out.println("The file does not exists");
			boolean created=f.createNewFile();
			if(created=true)
			{
				System.out.println("The file has been created.");
			}
			else
			{
				System.out.println("Error");
			}
		}

	}

}
