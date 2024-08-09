package medium;

import java.io.IOException;
import java.util.Scanner;

public class Combinador {

    /**
     Implemente um programa denominado combinador, que recebe duas strings e deve combiná-las,
     alternando as letras de cada string, começando com a primeira letra da primeira string,
     seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string, e assim sucessivamente.
     As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();

        while(cases>0) {
            cases--;
            String input = scanner.nextLine();

            String[] strings = input.split(" ");

            String str1 = strings[0];
            String str2 = strings[1];

            StringBuilder result = new StringBuilder();
            int minLength = Math.min(str1.length(), str2.length());

            for(int i = 0; i < minLength; i++) {
                result.append(str1.charAt(i));
                result.append(str2.charAt(i));
            }

            if (str1.length() > str2.length()) {
                result.append(str1.substring(minLength));
            } else {
                result.append(str2.substring(minLength));
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
