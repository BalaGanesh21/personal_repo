package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEquals {
	
	public boolean arraysEquals() {
	   List<Integer> list1=Arrays.asList(10,2,44,10,3,90,100);
	     List<Integer> list2=Arrays.asList(100,90,2,10,3,44,10);
	     int n=list1.size();
	     int m=list2.size();
	     
	     if(m!=n) {
	    	 return false;
	     }
	     
	     Collections.sort(list1);
	     Collections.sort(list2);
	     
	     boolean result=list1.equals(list2);
	     return result;
}


	public static void main(String[] args) {
		ArrayListEquals obj=new ArrayListEquals();
		// TODO Auto-generated method stub
  boolean result=obj.arraysEquals();
  System.out.println(result);

}
}
