package java_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ComparablesComparator implements Comparator<ComparablesComparator> {
	
	int age;
	String name;
	
	public ComparablesComparator(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name+","+age;
		
	}
	
	public static void main(String args[]) {
		
		List<Integer> list=new CopyOnWriteArrayList<>();
	
		
		for(int i=0;i<100;i++) {
			list.add(i);
		}
		
		synchronized(list){
			Iterator<Integer> iterator=list.iterator();

	
	while(iterator.hasNext()) {
		Integer value = iterator.next();
        System.out.println("Iterating value: " + value);

        // Modify the list during iteration
        if (value == 50) {
            list.remove(1);  // This line causes ConcurrentModificationException
        }
	}
	}
	System.out.println(list);
	}

	
	

	@Override
	public int compare(ComparablesComparator o1, ComparablesComparator o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
