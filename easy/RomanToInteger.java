import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        
        System.out.println(romanToInt(input));
        
        scanner.close();
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int currValue = romanConvert(s.charAt(i));

            if (currValue > prevValue) {
                sum += currValue - 2 * prevValue; 
            } else {
                sum += currValue;
            }

            prevValue = currValue;
        }

        return sum;
    }

    public static int romanConvert(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Caractere romano inválido: " + c);
        }
    }
}
