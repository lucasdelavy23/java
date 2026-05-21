import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro:");
        int a = input.nextInt();
        input.nextLine();
        System.out.println("Digite o segundo número inteiro: ");
        int b = input.nextInt();
        input.nextLine();

        int soma = a + b;   
        int sub = a - b;
        int div = a / b;
        int mult = a * b;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + sub);
        System.out.println("A divisão dos valores é: " + div);
        System.out.println("A multiplicação dos valores é: " + mult + "\n");
        

        System.out.println(a + "+" + b + "=" + soma);
        System.out.println(a + "-" + b + "=" + sub);
        System.out.println(a + "/" + b + "=" + div);
        System.out.println(a + "*" + b + "=" + mult);

        input.close();
    }
}
