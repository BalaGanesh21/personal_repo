package List;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("dfadf");
   String ex="balaje";
   
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
