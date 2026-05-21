import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();
                 input.nextLine();
       
        int soma = 0;
        for (int i = 1; i <= num; i++){
            soma = soma + i;
        }

        System.out.println("O valor da soma é:" + soma);
        input.close();
    }
}