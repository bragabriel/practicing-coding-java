package medium;

import java.io.IOException;
import java.util.Scanner;

public class Criptografia {
    /**
    Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codificadas sem que alguém consiga lê-las. O processo é muito simples. São feitas três passadas em todo o texto.

    Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.

    Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.
    */
    public static void main(String[] args) throws IOException {
    
        Scanner scanner = new Scanner(System.in);

        Integer cases = scanner.nextInt();
        scanner.nextLine();
        
        for(Integer i=0; i<cases; i++){
            String input = scanner.nextLine();
            input = moveToRightEncrypt(input);
            input = invertLineEncrypt(input);
            input = moveToLeftEncrypt(input);
            System.out.println(input);
        }

        scanner.close();
    }

    public static String moveToRightEncrypt(String phrase){
    
        StringBuilder result = new StringBuilder();

        for(Integer i=0; i<phrase.length(); i++){

            char letra = phrase.charAt(i);

            if(Character.isLetter(letra)){
                letra += 3;
                result.append(letra);   
            }else{
                result.append(letra);
            }
        }
        
        return result.toString();
    }

    public static String invertLineEncrypt(String phrase){
        String result = new String();
        
        for(Integer i=0; i<phrase.length(); i++){
            result = phrase.charAt(i) + result;
        }
        
        return result;
    }

    public static String moveToLeftEncrypt(String phrase){
        Integer phraseLength = phrase.length();
        Integer halfPhrase = phraseLength/2;
        StringBuilder result = new StringBuilder();

        for(Integer i=0; i<halfPhrase; i++){
            char letra = phrase.charAt(i);
            result.append(letra);
        }

        for(Integer i=halfPhrase; i<phraseLength; i++){
            char letra = phrase.charAt(i);
            letra -= 1;
            result.append(letra);
        }

        return result.toString();
    }
}
