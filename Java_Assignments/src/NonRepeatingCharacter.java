
public class NonRepeatingCharacter {


	public static void main(String args[]) {

		String inputStr ="Bengaluru";

		for(char i :inputStr.toCharArray())
		{
			if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i))
			{
				System.out.println("First non-repeating character is: "+i);
				break;
			}
		}
	}
}

