import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array to be created ::");
		int size = sc.nextInt();
		String [] myArray = new String[size];

		for(int i=0; i<myArray.length; i++)
		{
			System.out.println("Enter the element "+(i+1)+" (String) :: ");
			myArray[i]=sc.next();
		}
		List<String> list = Arrays.asList(myArray);
		System.out.println("Given array is converted to a list");
		System.out.println("Contents of list ::"+list);
		list.toArray(myArray);
	}
}



