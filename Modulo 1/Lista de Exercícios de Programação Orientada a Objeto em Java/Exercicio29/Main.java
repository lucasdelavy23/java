package Exercicio29;

/*Crie uma classe chamada Pessoa. Essa classe deve possuir os atributos privados nome e
idade, além dos métodos get e set para cada atributo.
Depois, crie uma classe Aluno que herda de Pessoa. A classe Aluno deve possuir um
atributo privado chamado nota. Crie os métodos get e set para esse atributo. A classe
também deve possuir um método mostrarDados, que exibe nome, idade e nota do aluno.
Em seguida, crie uma classe Professor que também herda de Pessoa. A classe Professor
deve possuir um atributo privado chamado disciplina. Crie os métodos get e set para
esse atributo. A classe também deve possuir um método mostrarDados, que exibe nome,
idade e disciplina do professor.
Na classe principal, crie um objeto da classe Aluno e um objeto da classe Professor.
Preencha os dados usando os métodos set e depois chame os métodos mostrarDados. */
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();

        aluno1.setName("Lucas");
        aluno1.setAge(31);
        aluno1.setGrade(9.5);
        aluno1.showDetails();

        professor1.setName("Bruno");
        professor1.setAge(31);
        professor1.setDiscipline("Java");
        professor1.showDetails();
    }
}
