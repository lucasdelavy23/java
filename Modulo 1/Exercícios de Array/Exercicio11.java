import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio11 {
    public static void main(String[] args){
        /*Ver enunciado nos slides */
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Digite os valores do vetor: ");

            double sum = 0.0;
        for(int i = 0; i < 20; i++){
            double num = entrada.nextDouble();
            entrada.nextLine();
            numbers.add(num);
            if ( i > 9){
                sum += num;
            }
        }
        double media = sum/10;

        System.out.println(numbers);

        System.out.println("A media dos ultimos 10 números digitados é:" + media);

        entrada.close();

    }
}
