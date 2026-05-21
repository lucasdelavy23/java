import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= num; i++){
            System.out.print(i + " ");
        }
        input.close();
    }
}