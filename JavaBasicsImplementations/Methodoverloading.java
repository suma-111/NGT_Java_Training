package JavaBasicsImplementations;

public class Methodoverloading {
	
	public static void main (String[] args) {
	   add( 2 ,3);
	   add(2.5f , 6.0f);
	}
	
private static void add() {
	int sum = 10 + 20;
	System.out.println(sum);
	
}
private static void add(int a,int b) {
	int sum = a + b;
	System.out.println(sum);
}
private static void add(float a,float b) {
	float sum = a+b;
	System.out.println(sum);
}
}
