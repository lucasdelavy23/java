public class Main {

    static void evaluate_imc (double imc){
        if (imc <= 18.9){
            System.out.println("Caso 1");
        } else if (imc <= 24.9){
            System.out.println("Caso 2");
        } else{
            System.out.println("Caso 3");
        }
    }

    public static void main(String[] args) {
        // Atributos
        Pessoa pessoa1 = new Pessoa();

        pessoa1.name = "Lucas";
        pessoa1.age = 31;
        pessoa1.height = 1.80;
        pessoa1.weight = 113.00;
        evaluate_imc(pessoa1.imc());

        Pessoa pessoa2 = new Pessoa();

        pessoa2.name = "Vitor";
        pessoa2.age = 31;
        pessoa2.height = 1.83;
        pessoa2.weight = 100.00;
        evaluate_imc(pessoa1.imc());
        
        // Métodos
        double imc = pessoa1.imc();
        pessoa1.presentation();

        System.out.printf("My IMC index is: %.2f", imc);

        pessoa2.presentation();
        System.out.println(pessoa2.imc());
    }
}