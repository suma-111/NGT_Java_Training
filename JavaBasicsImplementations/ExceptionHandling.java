package JavaBasicsImplementations;

public class ExceptionHandling {
public static void main(String[] args) {
	
	
	System.out.println("The starting of the code");
	
	int[] a= {10,5,7,20,30};
	System.out.println(a[2]);
     //multiple exception
	try {
		int res = a[1]/0;
		System.out.println(a[10]);
	}catch(ArrayIndexOutOfBoundsException | ArithmeticException Exception){
	System.out.println(Exception);
	}finally {
		System.out.println("The finally block is always excecuted");
	}
	//unknown exception
	try {
	String name=null;
	System.out.println(name.length());
	}catch(Exception exception) {
		System.out.println(exception);
	}
	System.out.println("the end of the code");
	
}
}
