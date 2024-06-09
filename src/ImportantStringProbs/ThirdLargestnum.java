package ImportantStringProbs;

import java.util.Arrays;

public class ThirdLargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] numbers = {4,4,6,6,7,7,8,66,78}; // Example array of numbers
	        int thirdLargest = findThirdLargest(numbers);
	        System.out.println("Third largest number: " + thirdLargest);
	    }

	    public static int findThirdLargest(int[] arr) {
	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        int distinctCount = 1;
	        for (int i = arr.length-2; i >=0; i--) {
	            if (arr[i]!= arr[i + 1]) {
	                distinctCount++;
	            }
	            if (distinctCount == 3) {
	                return arr[i];
	            }
	        }
	        // If the array doesn't have a third distinct element, return the maximum element
	        return arr[arr.length];
		
		
		
		
		
		
		
		
		
	}

}
