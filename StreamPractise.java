package java_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> obj=List.of("Bala","aravind","subha","maha");
		List<String> lenght=obj.stream().filter(a->a.length()>5)
				.collect(Collectors.toList());
		
		System.out.println(lenght);
		
		List<Integer> integer=List.of(22,10,8,30);
	  Optional<Integer> op= integer.stream().sorted((x,y)->y-x).skip(1).findFirst();
		
	  System.out.println("Second maximum number"+op);
	  
	  
	  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	  List<Integer> reversed = numbers.stream()
	                                  .sorted(Comparator.reverseOrder())
	                                  .collect(Collectors.toList());
	  System.out.println(reversed); // [5, 4, 3, 2, 1]
	  
	  
	  List<String> words = Arrays.asList("apple", "bananaaaaa", "cherry");
	  Optional<String> result=words.stream().min(Comparator.comparingInt(String::length));
	  System.out.println("Longest string"+result.get());
	  
	  List<Person> people = Arrays.asList(
	            new Person("Alice", 25),
	            new Person("Bob", 30),
	            new Person("Charlie", 25)
	        );
	  
            people.stream().filter(p->p.startsWith("A")).collect(collectors.toList());
            
            people.stream().map(Person::getName()).sorted(String::length).
            collect(Collections.toList());
            
            people.stream().map(Person::getAge()).distinct().count();
}
