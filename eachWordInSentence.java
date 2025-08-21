package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class eachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ex="I was looking for a job in a MNC Company. I am interested";
	
		
		Map<String, Integer> freq =
	            Arrays.stream(ex.split("\\s+"))              // Stream<String>
	                  .map(w -> w.replaceAll("\\W", ""))     // clean punctuation
	                  .filter(w -> !w.isEmpty())
	                  .collect(Collectors.groupingBy(
	                           Function.identity(),          // key = word
	                           TreeMap::new,                 // keep alphabetical order
	                           Collectors.summingInt(w -> 1) // count
	                  ));


		
		
	}

}
