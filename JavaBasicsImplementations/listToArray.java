import java.util.ArrayList;
public class listToArray 
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bengaluru");
		list.add("Pune");
		list.add("Goa");

		System.out.println("Contents of list ::"+list);
		String[] myArray = new String[list.size()];
		list.toArray(myArray);

		for(int i=0; i<myArray.length; i++)
		{
			System.out.println("Element at the index "+i+" is ::"+myArray[i]);
		}
	}
}