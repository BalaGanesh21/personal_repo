package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementBetweenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1=Arrays.asList(1,4,6,7,8);
		List<Integer> list2=Arrays.asList(1,5,6,10,12);
		
		List<Integer> result=list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		System.out.println("Common element between lists"+result);
				
	}

}
