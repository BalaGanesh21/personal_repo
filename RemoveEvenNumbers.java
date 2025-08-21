package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=Arrays.asList(1,2,4,7,9);
		List<Integer> list= obj.stream().filter(a->a%2!=0).collect(Collectors.toList());
		System.out.println(list);
	}

}
