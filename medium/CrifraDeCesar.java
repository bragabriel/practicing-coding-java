package medium;

import java.io.IOException;
import java.util.Scanner;

public class CrifraDeCesar {

    /**
    Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições.

    Entrada
    A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.
     */
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Integer cases = scanner.nextInt();
        Integer cont = 0;

        while (cont < cases) {
            cont++;
            scanner.nextLine();
            String phrase = scanner.nextLine().toUpperCase();
            Integer cod = scanner.nextInt();

            String cifra = cifraDeCesar(phrase, cod);
            System.out.println(cifra);
        }

        scanner.close();
    }

    public static String cifraDeCesar(String phrase, Integer cod) {

        StringBuilder result = new StringBuilder();

        for (Integer i = 0; i < phrase.length(); i++) {

            char letter = phrase.charAt(i);

            letter -= cod;
            
            if ((int) letter < 65) {
                letter = (char) (26 + letter);
            }
            result.append(letter);
        }

        return result.toString();
    }
}