package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commaSeparatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Iam","doing","Coding","in","java");
		String result=list.stream().collect(Collectors.joining(","));
		
		System.out.print("Converted a list of String into Single String /n "+result);


	}

}
