package JavaBasicsImplementations;

import java.util.ArrayList;

public class Arraylist {
	
public static void main(String[] args) {
	//Arraylist
	ArrayList<String> list = new ArrayList<>(); 
	list.add("Sai");
	list.add("Durga");
	list.add("India");
   list.add(0, "vithanala");
  System.out.println(list.get(2));
  list.remove(0);
  list.contains("sai");
 
	for(String s : list) {
		System.out.println(s);
	}
		
	
	
}

}
