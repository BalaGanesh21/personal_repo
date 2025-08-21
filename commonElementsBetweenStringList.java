package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonElementsBetweenStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("Hi", "Iam","BalaGanesh");
		List<String> list2=Arrays.asList("BalaGanesh");
		
		List<String> result= list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		System.out.println("Common String between list"+result);

	}

}
