
public class AlphaNumeric 
{
	
	public static void main(String[] args) {
		int c=0, d=9;
		String str = "Get 1 The 22 Future 333 You 444 Want";
		str=str.toLowerCase();
	
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)>=(char)97 && str.charAt(i)<=(char)122) {
				//No action
			    //System.out.print(str.charAt(i));
			}
			else if(str.charAt(i)==' '){
				System.out.println("");
			}

			else {
				System.out.print(str.charAt(i));
			}			
		}		
	}


	
}
