public class SumEvenNumbers {
	/*
	* Write a function that receives an array of integers and returns the sum of all even numbers in the array.
	* Example input: [1, 2, 3, 4, 5, 6]
	* Expected output: 12
	*/
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5, 6};
		System.out.println(sumEvenNumbers(input));
	}

	private static int sumEvenNumbers(int[] input){
		int evenSum = 0;

		for(int i = 0; i < input.length; i++) {
			if(input[i] % 2 == 0){
				evenSum += input[i];
			}
		}
		return evenSum;
	}
}
