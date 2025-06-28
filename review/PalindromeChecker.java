public class PalindromeChecker {
	/*
	 * Write a function that checks if a given string is a palindrome. Ignore case sensitivity.
	 * Example input: "Radar"
	 * Expected output: true
	 */
	public static void main(String[] args) {
		System.out.println(verifyPalindrome("RADAR"));
	}

	private static boolean verifyPalindrome(String input){
		input = input.toLowerCase();
		StringBuilder reverseInput = new StringBuilder();
		for (int i = input.length(); i != 0; i--){
			reverseInput.append(String.valueOf(input.charAt(i-1)));
		}
		return input.contentEquals(reverseInput);
	}

	private static boolean easyWay(String input){
		String reversed = new StringBuilder(input).reverse().toString();
		return input.equals(reversed);
	}

}
