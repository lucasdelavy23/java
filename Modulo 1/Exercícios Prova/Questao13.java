import java.util.*;

public class Questao13 {
    public static void main(String[] args) {
        /*Crie um programa que leia uma sequencia de numeros inteiros utilizando um ArrayList.
        Apos a leitura, o programa deve remover todos os valores negativos da lista e, em seguida,
        exibir os valores restantes.*/
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int num = 1;
        while (num != 0){
            System.out.println("Digite os valores interos, positivos ou negativos, desejados para o array. (Digite 0 para finalizar o array):");
            num = input.nextInt();
            
            if (num == 0){
                break;
            }
            
            numbers.add(num);
        }

        numbers.removeIf(n -> n < 0);
        

        System.out.println(numbers);
        input.close();
    }
    
}
