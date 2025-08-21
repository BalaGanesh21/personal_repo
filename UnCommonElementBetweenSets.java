package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UnCommonElementBetweenSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet();
		Set<Integer> l=new HashSet();
		
		l.add(1);
		l.add(2);
		for(int i=1;i<10;i++) {
			s.add(i);
		}
		Set<Integer> result=s.stream().filter(e->!l.contains(e)).collect(Collectors.toSet());
		System.out.println("Element in set 1 not in set2"+result);
		
	}

}
