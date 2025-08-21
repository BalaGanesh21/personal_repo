package java_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class listOfDuplicateCharacters {

	public void checkDuplicateChar() {
	
	String s="bal--ajee  ";
	String replace=s.replaceAll("[^A-Za-z0-9_]", "");
	char[] ch=replace.toCharArray();
	
	
	
	List<Character> list=new ArrayList<>();
	
	for(char c:ch) {
		list.add(c);
	}
	Map<Character, Long> obj=list.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
	
	List<Character> result=new ArrayList<>();
	
	for(Entry<Character, Long> a:obj.entrySet()) {
		if(a.getValue()>1) {
			result.add(a.getKey());
		}
	}
	System.out.println("Final list"+result.toString());
	}
	
	public static void main(String args[]) {
		
	listOfDuplicateCharacters obj=new listOfDuplicateCharacters();	
		obj.checkDuplicateChar();
		
	}
}
