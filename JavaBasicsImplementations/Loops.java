package JavaBasicsImplementations;

public class Loops {
	
public static void main(String[] args) {
	int i = 20;
	//while loop
	while(i>10) {
		System.out.println(i);
		i--;
	}

	while(i>=0) {
		
	if(i%2==0) {
	System.out.println(i);
}
	i--;
}
	//for loop
	for( i = 0; i<=20; i++ ) {
		if(i%2==0) {
			System.out.println(i);
		}
}
	//do while loop
	do {
		if(i % 2 == 0) {
			System.out.println(i);
		}
		i++;
	}while(i<=40);
	//enhance for loop
	String [] names ={"Sai","Kanna","Devi"};
	for(String name : names) {
		System.out.println(name);
		System.out.println(",");
	}
	
			}
}