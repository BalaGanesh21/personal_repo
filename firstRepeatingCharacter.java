package Set;

public class firstRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="bbaalagannesh";
		char[] obj=s.toCharArray();
		char result = 0;
		for(int i=0;i<s.length()-2;i++) {
			
			if(obj[i]==obj[i+1]) {
				result=obj[i];
				break;
			}
		}
		
		if(result==0) {
			System.out.println("There is no repeating character in the string");
		}else {
		String str=String.valueOf(result);
		System.out.println("The repeating character is"+str);
		}
	}

}
