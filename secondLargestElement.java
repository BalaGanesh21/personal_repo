package List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class secondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> obj=Arrays.asList(99,10,3,178,33,90,44);
		List<Integer> result=obj.stream().sorted((x,y)->y-x).collect(Collectors.toList());
	     System.out.println("Second Largest element"+result.get(1));	
	}

}
