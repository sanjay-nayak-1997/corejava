public class ArrayManipulation {
	
public static void main(String[] args) {
		
		int[] array=new int[5];
		
		array[0]=25;
		array[1]=36;
		array[2]=16;
		array[3]=26;
		array[4]=47;
		
		int[] array1= {12,50,2,5,55,25};
		
		int biggest1=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>biggest1)
			{
				biggest1=array[i];
			}
		}
		
		int biggest2=array1[0];
		for(int i=1;i<array1.length;i++)
		{
			if(array1[i]>biggest2)
			{
				biggest2=array1[i];
			}
		}
		
		int smallest2=array1[0];
		for(int i=1;i<array1.length;i++)
		{
			if(array1[i]<smallest2)
			{
				smallest2=array1[i];
			}
		}
		
		int sum=0;
		for(int i=0;i<array1.length;i++)
		{
			sum+=array1[i];
		}
		
		int sumeven=0;
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]%2==0)
			{
			sumeven+=array1[i];
			}
		}
		
		System.out.println("The biggest element in the array is " + biggest1);
		System.out.println("The biggest element in the array1 is " + biggest2);
		System.out.println("The smallest element in the array1 is " + smallest2);
		System.out.println("The sum of the elements in the array1 is " + sum);
		System.out.println("Sum of the even elements in the array1 is " + sumeven);
	}

}
