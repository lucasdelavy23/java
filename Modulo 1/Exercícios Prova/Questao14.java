import java.util.*;

public class Questao14 {
    public static void main(String[] args) {
        /*Considere uma lista de n´umeros inteiros que pode conter valores repetidos. Crie um
        programa que percorra essa lista e gere uma nova lista contendo apenas valores ´unicos,
        removendo todas as duplicatas, sem utilizar estruturas prontas que fa¸cam isso automaticamente. */
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersNoRep = new ArrayList<>();

        System.out.println("Digite 10 valores inteiro para seu array: ");
        for (int i = 0; i < 5; i++){
            int num = input.nextInt();
            input.nextLine();
            numbers.add(num);
        }
          
        for (Integer num : numbers){
            if (!numbersNoRep.contains(num)){
                numbersNoRep.add(num);
            }
        }
       
        System.out.println(numbersNoRep);
        input.close();
    }

}