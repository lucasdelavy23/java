/*Utilize a classe Pessoa do exercício anterior. Agora, além dos atributos nome e idade,
a classe deve possuir um método chamado apresentar. Esse método deve exibir no
terminal o nome e a idade da pessoa.
Na classe principal, crie dois objetos da classe Pessoa. Atribua valores diferentes para
cada objeto e chame o método apresentar para cada um deles. O aluno deve perceber
que o mesmo método pode ser executado por objetos diferentes, exibindo informações
diferentes de acordo com os dados armazenados em cada objeto. */
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.setName("Lucas");
        pessoa1.setAge(31);

        pessoa2.setName("Ariovaldo");
        pessoa2.setAge(93);

        pessoa1.presentacion();

        pessoa2.presentacion();
    }
}