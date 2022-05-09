package JavaBasicsImplementations;

public class vardataoper {
public static void main(String[] args) {
	//String
	String name = "Sai Durga";
	System.out.println(name);
	//int 
	int age = 23;
	System.out.println(age);
	//char
	char salary= '$';
	System.out.println(salary);
	//float
	float height = 5.3f;
	System.out.println(height);
	//double
	double salar = 2000.5;
	System.out.println(salar);
	
	
	//operators
	//Arithmetic Operators
	int x = 20;
	int y = 10;
	//int z = x+y;
	//int z = x-y;
	//int z = x*y;
	//int z = x%2;
	//int z = x/y;
	float z = 7.0f/2;
	System.out.println(z);
 //increment& decrement
	System.out.println(age++);
	System.out.println(++age);
	
	System.out.println(age--);
	System.out.println(--age);
	
	//logical operators
	int num1 = 10;
	int num2 = 30;
	boolean A = num1 >5;
			boolean B= num2< 20;
			System.out.println(A||B);
			System.out.println(A&&B);
			System.out.println(!(A&&B));
			
			
}
}
