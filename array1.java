package myfirstproject;

public class array1 {

	public static void main(String[] args) {
		
		int[] array=new int[5];
		
		array[0]=25;
		array[1]=36;
		array[2]=26;
		array[3]=26;
		array[4]=27;
		
		System.out.println("Elements of the array are :-");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("Elements in the reverse order are :-");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i] + " ");
		}
		int counter=0;
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]==26)
			{
				counter++;
			}
		}
		System.out.println();
		if(counter==0)
		{
			System.out.println("The element 26 is not found in the array." );
		}
		else
		{
			System.out.println("The element 26 is found "+ counter +" time/s in the array.");
		}
		

	}

}
