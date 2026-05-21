import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        

        System.out.println("Olá "+ nome + ".");
        input.close();
    }
}
