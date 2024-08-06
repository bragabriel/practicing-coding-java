package medium;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LED_v2 {
    /**
     * João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem
     * certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números
     * abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o
     * valor.
     */
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Integer testScenarios = scanner.nextInt();
        scanner.nextLine();

        for(Integer i=0; i<testScenarios; i++){
            String num = scanner.nextLine();
            Integer numOfLeds = matchesAndCount(num);
            System.out.println(numOfLeds + " leds");
        }

        scanner.close();
    }

    public static Integer matchesAndCount(String num){
        Integer numOfLed = 0;

        HashMap<Character, Integer> ledMap = new HashMap<>();

        ledMap.put('1', 2);
        ledMap.put('7', 3);
        ledMap.put('4', 4);
        ledMap.put('2', 5);
        ledMap.put('3', 5);
        ledMap.put('5', 5);
        ledMap.put('6', 6);
        ledMap.put('9', 6);
        ledMap.put('0', 6);
        ledMap.put('8', 7);

        for(char letter : num.toCharArray()){
            if (ledMap.containsKey(letter)) {
                numOfLed += ledMap.get(letter);
            }
        }

        return numOfLed;
    }
}
