import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {
    public static void main (String[] args){
        /*12) Peça um número ao usuário e verifique se ele existe no array. */
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Digite o número que você quer procurar no array.");
        int find = input.nextInt();
        input.nextLine();

        if(numbers.contains(find)){
            System.out.println("O número " + find + " está no array. Ocupando a posição " + numbers.indexOf(find) + ".");
        }else{
            System.out.println("O número " + find + " não está no array.");
        }
       
        System.out.println("O array digitado foi o seguinte: "+ numbers);
        input.close();
    }
}
