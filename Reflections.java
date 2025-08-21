package java_project;
import java.lang.reflect.*;
public class Reflections {
	
	    private String name;
	    private int age;

	    public Reflections(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) throws Exception {
	        // 1. Get the Class object
	        Class<?> clazz = Class.forName("Person");
	        
	        // 2. Get constructor and create object
	        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
	        Reflections person = (Reflections) constructor.newInstance("Alice", 25);

	        // 3. Accessing Fields
	        Field nameField = clazz.getDeclaredField("name");
	        nameField.setAccessible(true);  // Make private field accessible
	        nameField.set(person, "Bob");  // Modify private field value
	        
	      Field age=clazz.getDeclaredField("age");
	      age.setAccessible(true);
	      age.set(person, 12);

	        System.out.println("Age is"+age.toString());
	        
	        // 4. Accessing Methods
	        Method method = clazz.getMethod("displayInfo");
	        method.invoke(person);  // Invoking method dynamically
	        System.out.println(person.toString());
	        // Output after reflection manipulation:
	        // Name: Bob, Age: 30
	    }
	}
