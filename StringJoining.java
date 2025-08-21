package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str=Arrays.asList("this","is","going","to","work");
		
	String obj=	str.stream().collect(Collectors.joining(","));
	
	System.out.println("After merging \n"+obj);

	}

}
