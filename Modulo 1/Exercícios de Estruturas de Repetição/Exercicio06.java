public class Exercicio06 {
    public static void main(String[] args) {
        // 6) Imprima na tela os numeros de 1 a 1000 que são divisiveis por 13.

        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }
    }
}
