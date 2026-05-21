import java.util.*;

public class Questao15 {
    public static void main(String[] args) {
        /*Crie um programa que leia uma sequencia de numeros inteiros e determine
         quantas vezes cada numero aparece. O resultado deve ser exibido de forma que cada numero
         seja apresentado juntamente com sua quantidade de ocorrencias.
        */

        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> contagem = new HashMap<>();

        int num = 1;
        while (num != 0) {
            System.out.println("Digite os valores interos desejados e lhe direi quantas vezes cada numero ocorre na sequencia. (Digite 0 para finalizar a inserção de dados):");
            num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (contagem.containsKey(num)) {
                int freqAtual = contagem.get(num);
                contagem.put(num, freqAtual + 1);
            } else {
                contagem.put(num, 1);
            }
        }

        

        System.out.println(contagem);
        input.close();
    }
}