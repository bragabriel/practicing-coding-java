public class CalcRecursiveFactorial {
	/*
	* Write a recursive function that calculates the factorial of a given number n.
	* Example input: 5
	* Expected output: 120
	*/
	public static void main(String[] args) {
		System.out.println(calcRecursiveFactorial(5));
	}

	private static int calcRecursiveFactorial(int n){
		if (n <= 1) return 1;
		return n * calcRecursiveFactorial(n - 1);
	}
}
