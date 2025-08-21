package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1=Arrays.asList(20,2,1,1,1,1,100,90,33);
		
		List<Integer> removeduplicates=list1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(removeduplicates);
	}

}
