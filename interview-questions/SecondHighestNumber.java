public class SecondHighestNumber{

	public static void main(String[] args) {
		int[] nums = {10, 5, 20, 8, 30, 2, 25};

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > highest) {
				secondHighest = highest;
				highest = num;
			}else if (num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}

		if (secondHighest == Integer.MIN_VALUE) {
			System.out.println("Não há segundo maior número distinto.");
		} else {
			System.out.println("Segundo maior número: " + secondHighest);
		}
	}
}