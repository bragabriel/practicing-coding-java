import java.util.Scanner;

public class PalindromeNumber {
    /**
     Given an integer x, return true if x is a palindrome, and false otherwise.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();

        System.out.println(isPalindrome(number));

        scanner.close();
    }

    public static Boolean isPalindrome(int x){ 
        String number = Integer.toString(x);
        String reversedNumber = new StringBuilder(number).reverse().toString();
        int result = 0;

        for(Integer i=0; i<number.length(); i++){
            if(number.charAt(i) == reversedNumber.charAt(i)){
                result++;
            }
        }
        if(result == number.length()){
            return true;
        }else{
            return false;
        }   
    }
}
