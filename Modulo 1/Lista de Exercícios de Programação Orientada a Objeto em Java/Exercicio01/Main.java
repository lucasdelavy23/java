/*Crie uma classe chamada Pessoa. Essa classe deve possuir dois atributos: nome, do tipo
String, e idade, do tipo int. Depois, crie uma classe principal com o método main.
Dentro do método main, crie um objeto da classe Pessoa, atribua manualmente um nome
e uma idade para esse objeto e exiba essas informações no terminal.
Neste exercício, não é necessário usar Scanner. Os valores podem ser definidos diretamente
no código. O objetivo é praticar a criação de uma classe, a criação de um objeto
e o acesso aos atributos do objeto.
A saída esperada deve ter uma estrutura semelhante à seguinte:
 Nome : Joao
 Idade : 20 */
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setName("Lucas");
        pessoa1.setAge(31);

        System.out.println("Nome: " + pessoa1.getName());
        System.out.println("Idade: " + pessoa1.getAge());

    }

}
