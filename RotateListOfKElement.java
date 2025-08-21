package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateListOfKElement {
	
	public static List<Integer> rotateListElement(List<Integer> list,Integer a){
		
	List<Integer> reverseList=new ArrayList();
	
	
	for(int i=a;i<=list.size()-1;i++) {
		reverseList.add(list.get(i));
	}
	
	
	for(int i=0;i<=a-1;i++) {
		reverseList.add(list.get(i));
	}

		
		return reverseList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Integer k=3;
		List<Integer> result=rotateListElement(list,k);
		
		System.out.println("Reverse list is"+result);
	}

}
