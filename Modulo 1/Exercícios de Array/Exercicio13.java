import java.util.ArrayList;
import java.util.Collections;

public class Exercicio13 {
    public static void main (String[] args){
        /*13) Crie um novo array com os valores invertidos. */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
   
        ArrayList<Integer> invertnumbers = new ArrayList<>(numbers);

        Collections.reverse(invertnumbers);

        System.out.println("Array invertido:" + invertnumbers);

        System.out.println("Array original: " + numbers);
    }
}