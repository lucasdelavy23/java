import java.util.*;

public class Pratica02 {
    public static void main(String[] args) {
        /*Crie um programa que leia uma quantidade inteira N e, em seguida, leia N números inteiros. Ao final, o programa
        deve exibir a soma dos valores, a média, o maior número e o menor número informado. */
        
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        int soma = 0;

        System.out.println("Digite o tamanho desejado para seu array: ");
        int tam = input.nextInt();
        input.nextLine();
        
        System.out.println("Digite os valores que serão inseridos no array: ");
       
        for (int i = 0; i < tam; i++){
            int num = input.nextInt();
            input.nextLine();
            numbers.add(num);
            soma += num;
        }
        
        double media = soma/(double)tam;

        System.out.println("Este é o array criado:" + numbers);
        System.out.println("O maior valor digitado foi: " + Collections.max(numbers));
        System.out.println("O menor valor digitado foi: " + Collections.min(numbers));
        System.out.println("A média dos valores digitados é:" + media);

        input.close();
    }
}