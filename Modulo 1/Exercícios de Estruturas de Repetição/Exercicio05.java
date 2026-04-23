public class Exercicio05 {
    public static void main(String[] args) {
        // 5) Imprima na tela os numeros divisiveis por 4 entre 100 e 1000.
        for (int i = 100; i <= 1000; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
