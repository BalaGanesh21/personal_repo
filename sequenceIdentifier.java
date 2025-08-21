package List;

import java.util.Arrays;
import java.util.List;

public class sequenceIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> obj=Arrays.asList(1,1,2,2,3,3,3,3,3,4,4,5,2,2,2,2);
		int n=0;
		int maxSeq=n;
		for(int i=0;i<obj.size()-2;) {
			n=0;
			for(int j=i+1;i<obj.size()-1;j++) {
				if(obj.get(i)==obj.get(j)) {
					n++;
					i++;
				}
				else {
					i=j;
					n++;
					maxSeq=n;
					break;
				}
				
			}
		}
		
		System.out.println("Maximun sequence"+maxSeq);
	}

}
