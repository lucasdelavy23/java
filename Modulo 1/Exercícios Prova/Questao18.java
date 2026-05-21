import java.util.*;

public class Questao18 {
    public static void main(String[] args) {
        /*Crie um programa que leia nomes de alunos e suas respectivas notas e armazene essas
        informa¸c˜oes em uma estrutura que associe cada nome `a sua nota. Ap´os o armazenamento,
        o programa deve exibir todos os alunos juntamente com suas notas. */
        Scanner input = new Scanner(System.in);
        Map<String, Double> alunos = new HashMap<>();

        for (int i = 0; i < 3; i++){
            System.out.println("Digite o nome do Aluno: ");
            String name = input.nextLine();
            System.out.println("Digite a nota do Aluno: ");
            Double score = input.nextDouble();
            input.nextLine();

            alunos.put(name, score);
        }
        
        System.out.println(alunos);
        alunos.forEach((key, value) -> {
            System.out.println("Aluno: " + key + " Nota: " + value);
        });
        input.close();
    }

}
