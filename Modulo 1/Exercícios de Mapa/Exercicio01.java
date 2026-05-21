import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
         * Um professor deseja armazenar o nome de três alunos e suas respexticas
         * idades. Desenvolva im prorgama que tilize um Map para guardar essas
         * informações e, em seguida, exiba na tela o nome de cada aluno junto com sua
         * idade.
         */

        Scanner input = new Scanner(System.in);

        Map<String, Object> mapaAlunos = new HashMap<>();

        String nome;
        int idade;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno:");
            nome = input.nextLine();
            System.out.println("Digite a idade do aluno: ");
            idade = input.nextInt();
            input.nextLine();

            mapaAlunos.put(nome, idade);
        }

        mapaAlunos.forEach((key, value)-> {
         System.out.println("Nome: " + key + "Idade: " + value);
        });
       

       input.close();
    }
}