package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstNonRepeatingCharacterUsingLinkedHashMap {

	public static Character firstNonRepeatingCharacter(String s) {
		
		char[] obj=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		if(s.length()==0) {
			return null;
		}
		for(char a:obj) {
              map.put(a,map.getOrDefault(a, 0)+1);			
		}
		
		for(Entry<Character, Integer> iterate:map.entrySet()) {
			if(iterate.getValue()==1) {
				return iterate.getKey();
			}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="swiss";
		Character result=firstNonRepeatingCharacter(s);
		System.out.println("The first non repeating character is  "+result);
	}

}
