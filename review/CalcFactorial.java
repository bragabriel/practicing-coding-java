public class CalcFactorial {
	/*
	* Write a function that calculates the factorial of a given number n.
	* Example input: 5
	* Expected output: 120
	*/
	public static void main(String[] args) {
		System.out.println(calcFactorial(5));
	}

	private static int calcFactorial(int input){
		int sum = 1;
		for(int i = 1; i < input+1; i++){
			sum*=i;
		}
		return sum;
	}
}
