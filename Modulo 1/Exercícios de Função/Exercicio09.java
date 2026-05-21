public class Exercicio09 {
    public static void main(String[] args) {
        /*
         * Desenvolva uma função que receba um
         * número inteiro positivo e calcule o fatorial
         * desse número. O resultado deve ser retornado
         * pela função e exibido no programa principal.
         */
        factorial(4);
    }

    public static int factorial(int a) {
        int fact = 1;
        while (a > 0) {
            fact *= a;
            a--;
        }
        System.out.println(fact);
        return fact;

    }
}