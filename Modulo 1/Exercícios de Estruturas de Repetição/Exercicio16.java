import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /*Dado um número digitado pelo usuário, verifique se ele é primo */
        System.out.println("Digite um valor para saber se ele é primo:");

        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        entrada.nextLine();
        entrada.close();
        
        if (valor % 1 == 0 && valor % valor == 0 && valor % 2 == 0 && valor % 3 == 0 && valor % 5 == 0 && valor % 7 == 0 && valor % 9 == 0){
            System.out.println("O número digitado é PRIMO.");  
        }else{
            System.out.println("O número digitado não é PRIMO.");
        }
    }
}
