public class Exercicio5 {
    public static void main (String[] args){
        // Crie um programa que leia um número x e imprima 0 se ele estiver no intervalo 0<=x<3 e 1 caso contrário.

        double valor = 7;

        if (valor >= 0 && valor < 3){                     //&& chamado de operador lógico.
            System.out.println("0");
        } else{
            System.out.println("1");
        }
    }
}
