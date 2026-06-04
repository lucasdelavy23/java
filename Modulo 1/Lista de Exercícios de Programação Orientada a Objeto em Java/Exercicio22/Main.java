package Exercicio22;

import java.util.*;

/*Crie uma classe chamada Carro. Essa classe deve possuir os atributos modelo, velocidadeAtual
e velocidadeMaxima. Crie um construtor que receba o modelo do carro e a velocidade
máxima. A velocidade atual deve começar em zero.
A classe deve possuir os métodos acelerar, frear e mostrarVelocidade. O método
acelerar deve aumentar a velocidade atual em 10 km/h, mas não deve permitir que
a velocidade atual ultrapasse a velocidade máxima. O método frear deve diminuir a
velocidade atual em 10 km/h, mas não deve permitir que a velocidade fique abaixo de
zero.
Na classe principal, crie um objeto da classe Carro usando o construtor. Depois, crie um
menu para o usuário escolher se deseja acelerar, frear, mostrar velocidade ou sair. */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o modelo do carro: ");
        String model = input.nextLine();

        System.out.println("Digite a velocidade máxima: ");
        int maxSpeed = input.nextInt();
        input.nextLine();

        Carro carro1 = new Carro(model, maxSpeed);

        boolean run = true;

        while (run) {
            System.out.println("--- MENU ---");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Mostrar a velocidade");
            System.out.println("4 - Sair\n");

            System.out.println("\nDigite a opção desejada:");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    carro1.accelerate();
                    break;

                case 2:
                    carro1.breaker();
                    break;

                case 3:
                    carro1.showSpeed();
                    break;
                case 4:
                    System.out.println("Programa Finalizado!");
                    run = false;
                    break;

                default:
                    System.out.println("Opção digitada inválida!");
                    break;
            }
        }
        input.close();
    }
}
