package java_project;

public class longestConsecutiveSequence {

	public int longestConseelement(int[] arr) {

		int temperory = 0;
		int result = 0;
		int resultanElement=0;
		
		if(arr.length==0 ) {
			System.out.println("Empty array");
	    return 0;
		}
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
				temperory++;
			} else {
				temperory++;
				if (temperory >= result) {
					result = temperory;
					resultanElement=arr[i];
				}
				temperory = 0;
			}
		}

		if(temperory>=result) {
			result=temperory;
			resultanElement=arr[arr.length-1];
		}
		return resultanElement;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestConsecutiveSequence obj = new longestConsecutiveSequence();
		int[] arr = {};
		int result = obj.longestConseelement(arr);
		System.out.println("Result is " + result);
	}

}
