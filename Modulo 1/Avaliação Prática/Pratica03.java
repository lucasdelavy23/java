import java.util.*;

public class Pratica03 {
    public static void main(String[] args) {
        /*Crie um programa que leia números inteiros até que o usuário digite 0. O programa deve contar quantos números foram digitados, quantos eram pares,
        quantos eram ímpares e qual foi a soma total dos valores informados. O número 0 deve ser utilizado apenas como condição de parada e não deve entrar
        nos cálculos. */
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();

        int even = 0;
        int odd = 0;        
        int cond = 1;
        int i = 0;
        int sum = 0;
        while (cond != 0) {
            System.out.println("Digite um número, caso queria encerrar digite 0: ");
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            numbers.add(num);
            sum += num;
            i++;
        }

        for (int num : numbers){
            if (num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("O array digitado foi: " + numbers + " O array possui " + i + " valores.");
        System.out.println("O array possui " + even + " números pares.");
        System.out.println("O array possui " + odd + " números ímpares.");
        System.out.println("A soma dos valores do array é: " + sum);

        input.close();
    }
}
