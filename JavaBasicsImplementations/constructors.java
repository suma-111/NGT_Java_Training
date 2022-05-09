package JavaBasicsImplementations;

class Student
{
	String name;
	int age;
	int rollno;
	public Student() {
		name = "sai";
		age = 23;
		rollno =50;
		System.out.println("Student Details are:");
	}
	public Student(int i) {
		age = i;
		
	}
	public Student(int i1,int ii, String name1)
	{
		age = i1;
		rollno = ii;
		name = name1;
	}
}
 public class constructors {
	 public static void main(String[] args) {
		 
		 Student stu = new Student(); //default Constructor
		// Student stu = new Student(25,50,"sai"); //	 parameterized constructor
			
		 System.out.println("Student age:"+stu.age+",\nStudent name:" +stu.name +",\nstudent rollno "+stu.rollno);
		
		
		}
	 
	 }


 
