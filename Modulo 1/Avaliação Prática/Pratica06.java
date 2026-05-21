import java.util.*;

public class Pratica06 {
    public static void main(String[] args) {
        /* Crie um programa que simule o controle de presença de uma turma. O programa deve permitir cadastrar nomes de alunos em uma lista, sem aceitar nomes repetidos.
         Depois do cadastro o usuário deve registrar a presença dos alunos digitando seus nomes. Caso o nome informado não esteja cadastrado, 
         o sistema deve exibir uma mensagem infromando que o aluno não pertence à turma. Caso o aluno já tenha tido sua presença registrada, o sistema deve informar
          que a presennça ja foi marcada. Ao final o programa deve exibir a lista de alunos presentes, a lista de alunos ausentes e a porcentagem de presença da turma. 
        */
        Scanner input = new Scanner(System.in);
        Map<String, Boolean> names = new HashMap<>();        
        String name;

        while (true) {

            System.out.println("Digite o nome do aluno ou caso deseje encerrar o cadastro, digite 'fim'.");
            name = input.nextLine();

            if (name.equalsIgnoreCase("fim")) {
            System.out.println("Lista de chamada Finalizada.");
            break;
            }
            if (names.containsKey(name)) {
            System.out.println("Aluno já está na chamada.");
            continue;
            } else {
            System.out.println("Aluno adicionado na chamada.");
            }
            names.put(name, false);
        }

        while (true){
            System.out.println("Digite o nome do aluno para dar presença ou digite 'fim' para encerrar a chamada.");
            name = input.nextLine();

            if (name.equalsIgnoreCase("fim")) {
            System.out.println("Lista de chamada Finalizada.");
            break;
            }
            if(names.containsKey(name)){
                
                if (names.get(name) == true) {
                    System.out.println("O aluno " + name + " já possui presença.");     
                }else{
                    names.put(name, true);
                    System.out.println("O aluno " + name + " recebeu presença");
                }
                if (!names.get(name)){
                    System.out.println("O aluno não pertence a esta turma.");
                }
            
            }

            //Falta fazer Exibição da lista de alunos presentes, a lista de alunos ausentes e aporcentagem de presença da turma.


        }
        input.close(); 
    }
}
