package Set;

import java.util.LinkedHashMap;
import java.util.Map;

public class anagramsOfString {
	
	
	public boolean anagrams(String s1, String s2) {
		
		Map<Character,Integer> m=new LinkedHashMap();
		String s3=s1.replaceAll("//s+", "");
		String s4=s2.replaceAll("//s+", "");
		char[] ch=s1.toCharArray();
		for(char a:ch) {
			m.merge(a, 1, Integer::sum);
		}
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] c2=s2.toCharArray();
		
		for(char b:c2) {
			
			Integer count=m.get(b);
			
			if(count==null) {
				return false;
			}
			if(count==1) {
				m.remove(b);
			}
			else {
				m.put(b, count-1);
			}
		}
		
		return m.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		anagramsOfString obj=new anagramsOfString();
		String s1="balaje";
		String s2="ejalab";
		boolean result=obj.anagrams(s1, s2);
		System.out.println("result fo the string"+result);
	}

}
