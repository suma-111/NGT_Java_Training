package JavaBasicsImplementations;
     
public class Controlstate {
	
    public static void main(String[] args) {
    	
    //if statement
    	int salary = 25000;
    	if(salary > 20000) {
    		System.out.println("you got promotion");
    	}
    	
    	//if else statement
    	if(salary>30000) {
    		System.out.println("you got promotion");
    	}else {
    		System.out.println("you didnt get promotion");
    	}
    	
    	//NESTED IF
    	if(salary > 15000) {
    		if(salary > 20000 ) {
    			System.out.println("Your Salary is 20000 you got promotion and bonus");
    		}else {
    			System.out.println("Your Salary is 20000 you got promotion");
    		}
    	}else {
    		System.out.println("your Salary is 25000 so you are not promoted");

}
    //Ternary Operators
    int a = 3;
    int b = 4;
     int min;
    min = (a<b)? a:b;
    System.out.println(min);
    
    //switch statement
    
    int per = 80;
    
    switch(per) {
    
    case(80):
    	System.out.println("Excellent, Grade A");
    break;
    case(70):
    	System.out.println("Verygood, Grade B");
    break;
    case(60):
    	System.out.println("good, Grade C");
    break;
    case(50):
    	System.out.println("Avg, Grade D");
    break;
    case(40):
    	System.out.println("Fail, Grade F");
   break;
   default:
	   System.out.println("Invalid Marks");
   
    }
}
}


