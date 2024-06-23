package medium;

import java.io.IOException;
import java.util.Scanner;

public class LED {
    /**
     * João quer montar um painel de leds contendo diversos números. Ele não possui muitos leds, e não tem 
     * certeza se conseguirá montar o número desejado. Considerando a configuração dos leds dos números
     * abaixo, faça um algoritmo que ajude João a descobrir a quantidade de leds necessário para montar o
     * valor.
     */
    public static void main(String[] args) throws IOException {
    
        Scanner scanner = new Scanner(System.in);
        
        Double vlrTot = 0.0;
        Integer i = 0; 

        while(i<2){
            i++;
            
            Integer peca = scanner.nextInt();
            Integer num = scanner.nextInt();
            Double vlr = scanner.nextDouble();
            
            vlrTot += num*vlr;
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", vlrTot);
        
        scanner.close();
    }

    public static Integer matchesAndCount(String num){
        Integer numOfLed = 0;
        
        for(Integer i=0; i<num.length(); i++){
            char letter = num.charAt(i);
            if(letter == '1'){
                numOfLed += 2;
            }
            else if(letter == '7'){
                numOfLed += 3;
            }
            else if(letter == '4'){
                numOfLed += 4;
            }
            else if(letter == '2' || letter == '3' | letter == '5'){
                numOfLed += 5;
            }
            else if(letter == '6' || letter == '9' || letter == '0'){
                numOfLed +=6;
            }
            else if(letter == '8'){
                numOfLed += 7;
            }
        }

        return numOfLed;
    }
}
