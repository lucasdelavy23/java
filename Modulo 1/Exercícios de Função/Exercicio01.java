public class Exercicio01 {
    public static void main(String[] args) {
        println(Double.toString(soma(3.1, 4.2)));
        println(Double.toString(media(3,4)));
    }

    static void println (String value){
        System.out.println(value);
    }

    static double soma (double a, double b){
        return a + b;
    }

    static double media(double a, double b){
        return (a + b)/ 2;
    }
}
