import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        System.out.println("Digite sua idade:");
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        input.nextLine();
        input.close();
        
        if(idade < 18){
            System.out.println("Você é menor de idade.");
        }else{
            System.out.println("Você é maior de idade.");
        }
    }
}
