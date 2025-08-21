package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(20,2,1,1,1,1,100,90,33);
		List<Integer> list2=Arrays.asList(30,91,10,12,3,88);
		
		List<Integer> mergeList=Stream.of(list1,list2).
				flatMap(List::stream).
				distinct().
				collect(Collectors.toList());
		System.out.println(mergeList);
	   Collections.sort(mergeList);
	   System.out.println("After Sorting"+mergeList);

	}

}
