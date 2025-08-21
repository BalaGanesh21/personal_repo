package java_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

  class  Animals {
	
	int c=10;
     public void sound() {
        System.out.println("Animal makes a sound"+this.c);
    }
     
     public void soundOne(int c) {
    	 this.sound();
    	 System.out.println("print c"+c);
     }
     
 }
class Dog extends Animals {
	int a=0;
	
	
	public  static  void exampl(){
	System.out.println("static block execute");	
	}
	 
    
    @Override
    public void soundOne(int b ) {
    	System.out.println("print b"+b);
    }
    
    	
}

     public class Animal{
    public static void main(String[] args) {
    	
        Animals animal = new Dog();  // Upcasting - Dog to Animal
        animal.soundOne(10);  // Output: Dog barks
        
        Animals b=new Animals();
        b.soundOne(20);
        
        String a="bala";
        String c=a;
        System.out.println("print c"+c);
        
        ConcurrentHashMap<String, String> userMap = new ConcurrentHashMap<>();

        // Adding entries (key-value pairs)
        userMap.put("U001", "Alice");
        userMap.put("U002", "Bob");
        userMap.put("U003", "Charlie");

        // Printing the initial map
        System.out.println("Initial map: " + userMap);

        // Updating a value associated with an existing key
        userMap.put("U002", "Bobby");
        System.out.println("After updating Bob's name: " + userMap);

        // Checking if a key exists
        if (userMap.containsKey("U003")) {
            System.out.println("U003 exists with name: " + userMap.get("U003"));
        }

        // Removing an entry by key
        userMap.remove("U001");
        System.out.println("After removing U001: " + userMap);

        // Adding a new entry
        userMap.put("U004", "David");
        System.out.println("After adding U004: " + userMap);

        // Final map
        System.out.println("Final map: " + userMap);
      
    }
    }
     
