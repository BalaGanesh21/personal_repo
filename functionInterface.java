package java_project;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class functionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//predicate
		
		   Predicate<Integer> isEven = num -> num % 2 == 0;
	        System.out.println(isEven.test(4)); // true
	        System.out.println(isEven.test(7)); // false
	        
	        Predicate<String> startsWithVowel = str -> str.matches("^[AEIOUaeiou].*");
	        System.out.println(startsWithVowel.test("Apple"));  // true
	        System.out.println(startsWithVowel.test("Banana")); // false
	   
	        Predicate<Integer> isInRange = num -> num >= 10 && num <= 50;
	        System.out.println(isInRange.test(25));  // true
	        System.out.println(isInRange.test(55));  // false
	      
	        //function
	        
	        Function<Integer, Integer> square = num -> num * num;
	        System.out.println(square.apply(5)); // 25
	        
	        Function<String, String> toUpperCase = str -> str.toUpperCase();
	        System.out.println(toUpperCase.apply("hello")); // "HELLO"
	        
	        Function<String, Integer> getLength = str -> str.length();
	        System.out.println(getLength.apply("Hello World")); // 11
	        
	        
	        List<Integer> numbers = List.of(1, 2, 3, 4);
	        Function<Integer, Double> toDouble = num -> (double) num * 2;
	        List<Double> doubledValues = numbers.stream()
	                                            .map(toDouble)
	                                            .collect(Collectors.toList());
	        System.out.println(doubledValues); // [2.0, 4.0, 6.0, 8.0]
	        
	        
	        //functional chaning
	        
	        Function<Integer, Integer> chaining=a-> a;
	        Function<Integer,Integer> chainingOne=a->a*a*a;
	        Integer result=chaining.compose(chainingOne).apply(2);
	        System.out.println("Functional chaning"+result);
	        
	        //consumer
	        
	        
	        
	        List<Integer> numbers1 = List.of(1, 2, 3, 4);
	        Function<Integer, Double> toDouble1 = num -> (double) num * 2;
	        List<Double> doubledValues1 = numbers1.stream()
	                                            .map(toDouble)
	                                            .collect(Collectors.toList());
	        System.out.println(doubledValues); // [2.0, 4.0, 6.0, 8.0]
	        
	        
	        List<String> names = List.of("Alice", "Bob", "Charlie");
	        Consumer<String> addSuffix = name -> System.out.println(name + " Jr.");
	        names.forEach(addSuffix); // Alice Jr., Bob Jr., Charlie Jr.
	        
	        
	        //supplier
	        
	        Supplier<String> getString = () -> String.valueOf(Random.from(RandomGenerator.getDefault()));
	        System.out.println("Supplier "+getString.get().toString()); // Hello, Supplier!

	}

}
