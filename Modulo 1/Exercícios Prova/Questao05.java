import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: "); 
        double nota1 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        input.nextLine();

        System.out.println("As notas digitadas foram: " + nota1 + " " + nota2 + " " + nota3 );
        double media = (nota1+nota2+nota3)/3;
        System.out.println("A média do aluno é: " + media);

        if (media > 7){
            System.out.println("O aluno está aprovado.");
        }else{
            System.out.println("O aluno está reprovado.");
        }
        input.close();
    }
}
