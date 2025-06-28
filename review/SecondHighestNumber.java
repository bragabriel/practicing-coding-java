public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] input = {1, -1, 11, 5, 4, -4, 3, 0, 0, 11, 5};
		System.out.println(secondHighestNumber(input));
	}

	//scenarios:
	//11, 11, 11, 11 - works
	//-1, 0, 1, -2 - works
	//2, 2, 4, 4 - works
	//-1, -1, -2, -2 - works
	//-1, 0 - works
	// {} - works
	// null - works
	public static int secondHighestNumber(int[] arr){
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		if(arr == null || arr.length == 0){
			throw new RuntimeException("Array should not be empty");
		}

		for(int i = 0; i < arr.length; i++){ //highest
				if(arr[i] > highest){
					highest = arr[i];
				}
		}
		for(int i = 0; i < arr.length; i++){ //second
			if(arr[i] < highest && arr[i] > secondHighest){
				secondHighest = arr[i];
			}
		}
		if(secondHighest == Integer.MIN_VALUE){
			throw new RuntimeException("There isn't second highest");
		}

		return secondHighest; // Big O(n)
	}
}
