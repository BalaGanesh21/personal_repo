package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class smallestElementUsingTreeSet {

	
	public static Integer getKthSmallestElement(Set<Integer> s,Integer k) {
		
		//3,6,10,77,100
		if(k>s.size()) {
			return 0;
		}
		List<Integer> list=new ArrayList<>(s);
		System.out.println(list);
		Integer smallest=list.get(k-1);
		return smallest;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s=new TreeSet<>();
		s.add(10);
		s.add(3);
		s.add(100);
		s.add(6);
		s.add(77);
		
		
		int k=1;
		Integer result=getKthSmallestElement(s,k);
		
		if(result==0) {
			System.out.println("The k value is largest than the size of the set");
		}
		else {
		System.out.println("The k th smallest using treeset "+result );
		}
	}

}
