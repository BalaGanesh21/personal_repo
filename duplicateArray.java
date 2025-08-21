package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> obj=Arrays.asList(10,10,2,3,4,5,2);
	
		Set<Integer> hash=new HashSet<>();
		Iterator<Integer> i=obj.iterator();
		
		while(i.hasNext()) {
			hash.add(i.next());
		}
		
		System.out.println("Remove duplicate elements"+hash);
	}

}
