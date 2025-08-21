package java_project;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> str=Arrays.asList("Balajeee","Maha","Maha");
     List<Integer> str1=Arrays.asList(10,20,30,10);
     
    
    Stream stream=str.stream(); 
     
     Optional<String> largestString= stream.max(Comparator.comparingInt(String::length));
     System.out.println("largest legnth string"+largestString.get());
     
     Map<String, Long> frequency=str.stream().collect(Collectors.groupingBy(st->st.toString(), Collectors.counting()));
     
     System.out.println(frequency.toString());
     
     
      List<Integer> result= str1.stream().map(a->a*a).collect(Collectors.toList());
      int sum=str1.stream().mapToInt(Integer::intValue).sum();
      
      List<String> upperCase=str.stream().map(String::toUpperCase).collect(Collectors.toList());
      List<Integer>  removeDuplicateInteger=str1.stream().distinct().collect(Collectors.toList());
      System.out.println(removeDuplicateInteger.toString());
      
      
      long greaterThanThreeLenght=str.stream().filter(a->a.length()>3).count();
      System.out.println(greaterThanThreeLenght);
      
      Map<Integer,List<String>> groupByLenghtOfString=str.stream().collect(Collectors.groupingBy(String::length));
      
      for(Entry obj:groupByLenghtOfString.entrySet()) {
    	  System.out.println(obj.getKey()+""+obj.getValue());
      }
      
      List<Integer> sortedDesc=str1.stream().sorted((x,y)->y-x).collect(Collectors.toList());
      System.out.println(sortedDesc.toString());
      
      List<String> uniqueStringFromList=str.stream().distinct().collect(Collectors.toList());
      System.out.println(uniqueStringFromList.toString());
      
      Stream<Integer> secondHighestNumber=str1.stream().sorted((x,y)->y-x).limit(2);
      
      System.out.println(secondHighestNumber.skip(1).findFirst());
      
   
      
      
      
      }

}
