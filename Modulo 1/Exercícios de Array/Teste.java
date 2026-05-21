import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // Crie um array com 5 números inteiros e exiba todos na tela.
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        System.out.println(numeros);


        int soma = 0;

        for (int numero: numeros){
            soma+= numero;
        }

        System.out.println("O valor da soma dos valores do array é:" + soma);

        System.out.println("A média dos valores do array é: " + soma/numeros.size());    //numeros.size é o tamanho do array, neste caso 5.

        int max = numeros.get(0);               //aqui a variavel max está recebendo o valor do primeiro indice através do comando .get(0)
        for (int numero:numeros){
            if( numero > max){
                max = numero;
            }
        }
        System.out.println("O maior número do array é: " + max);

        int min = numeros.get(0);               //aqui a variavel min está recebendo o valor do primeiro indice através do comando .get(0)
        for (int numero:numeros){
            if( numero < min){
                min = numero;
            }
        }
        System.out.println("O menor número do array é: " + min);

        int par = 0;

        for (int numero: numeros){
            if (numero % 2 != 0){
                par++;
            }
        }

        System.out.println(par + " dos valores do array são impar.");
    }
}
