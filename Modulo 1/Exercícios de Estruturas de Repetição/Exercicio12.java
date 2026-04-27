public class Exercicio12 {
    public static void main(String[] args) {
        /*12) Supondo que a população de um país A seja da
         ordem de 80000 habitantes com uma taxa
         anual de crescimento de 3% e que a população
         de B seja 200000 habitantes com uma taxa de
         crescimento de 1.5%. Faça um programa que
         calcule e escreva o número de anos
         necessários para que a população do país A
         ultrapasse ou iguale a população do país B,
         mantidas as taxas de crescimento.*/

        double a = 80000;
        double b = 200000;
        int i = 0;

        while (a < b) {
            a = a + (a * 0.03);
            b = b + (b * 0.015);

            i++;
        }
        System.out.println("A população do pais A é: " + a + "\nA população do país B é: " + b);
        System.out.println("Levaria " + i + " anos para a população do país A ultrapassar ou igualar a população do país B.");
    }
}
