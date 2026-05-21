import java.util.*;

public class Questao16 {
    public static void main(String[] args) {
        /* Crie um programa que leia uma sequˆencia de n´umeros inteiros e armazene apenas valores unicos 
        utilizando uma estrutura adequada. Ao final, o programa deve exibir todos os valores armazenados, 
        garantindo que n˜ao existam repeti¸c˜oes.  */

        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Digite 5 valores inteiros: ");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            input.nextLine();
            numbers.add(num);
        }

        System.out.println(numbers);
        input.close();
    }
}