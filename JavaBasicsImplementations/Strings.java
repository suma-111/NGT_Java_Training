package JavaBasicsImplementations;

public class Strings {
public static void main(String[] args) {
	//literals type
	
	String str = "Sai",str1,str2;
	String str3="\'sai\'";
	System.out.println(str3);
	System.out.println(str);
	System.out.println(str.length());
	//lower case
    str1=str.toLowerCase();
	System.out.println(str1);
	//upper case
	str2=str.toUpperCase();
	System.out.println(str2);
	
	//new type
	String str4=new String("Kanna");
	System.out.println(str4);
	
	//String buffer
	StringBuffer sb= new StringBuffer("Sai Durga");
	sb.append(" welcome home");
	sb.delete(10, 17);
	sb.charAt(2);
	System.out.println(sb);
	//String builder
	StringBuilder bd=new StringBuilder("Devi");
	bd.append(str4);
	System.out.println(bd);
	
}
}
