package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> obj=Arrays.asList(10,20,30,40,50);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
	}

}
