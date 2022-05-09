package JavaBasicsImplementations;

public class Array {
public static void main(String[] args) {
	//first way of 1D
	int[] Myarray = {1, 12, 4, 27};
	//2nd way of 1D
	int[] Myarray2 = new int[4];
	Myarray2[0] =1;
	Myarray2[1] =12;
    Myarray2[2] =4;
	Myarray2[3] =47;
	
	for (int i =0; i<Myarray.length;i++) {
		System.out.println(Myarray[i]);
}
	System.out.println("");
	int [] array = Myarray2;
	array[1] = 50;
	for(int num : Myarray2)
		System.out.println(num);
	System.out.println("");
	//addition of array
	int sum=0;
	for(int i =0; i < Myarray2.length;i++) {
		sum = sum+Myarray2[i];
	}
	System.out.println(sum);
	
	//2D array
	
	int a[][] = {{1,2,3,4},
			     {5,6,7,8},
			     {9,10,11,12}
	            };
	System.out.println(a[1][1]);
	System.out.println("\n");
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			System.out.print( a[i][j]);
		}
		System.out.println();
	}
	
}
}
