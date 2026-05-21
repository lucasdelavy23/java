import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * Uma aplicação precisa armazenar o nome de algumas cidades e suas populações.
         * Após inserir os dados em uMap, o programa deve exibir a população de uma
         * cidade específica definida no código.
         */

        Scanner input = new Scanner(System.in);
        String city;
        int pop;

        Map<String, Object> mapCity = new HashMap<>();

        for (int i=0; i < 3; i++){
            System.out.println("Digite o nome da cidade: ");
            city = input.nextLine();
            System.out.println("Digite a população: ");
            pop = input.nextInt();
            input.nextLine();

            mapCity.put(city,pop);
        }


        input.close();
        mapCity.forEach((chave, valor) -> {
         System.out.println("Cidade: " + chave + " População: " + valor);
        });
    }
}
