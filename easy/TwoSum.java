import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = { 3, 2, 4 };
        int target = 6;

        int[] retorno = twoSum(nums, target);
        System.out.println(Arrays.toString(retorno));

        scanner.close();
    }

    public static int[] twoSum(int[] nums, int target) {

        for (Integer i = 0; i < nums.length; i++) {
            for (Integer k = 1; k < nums.length; k++) {
                if ((nums[i] + nums[k]) == target) {
                    return new int[] { i, k };
                }
            }
        }
        return null;
    }
}
