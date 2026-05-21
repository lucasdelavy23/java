public class Main {
    public static void main (String []args){
        //Atributos
        Aluno aluno = new Aluno();
        aluno.name = "Lucas";
        aluno.grades[0]= 5.0;
        aluno.grades[1]= 7.0;
        aluno.grades[2]= 6.0;
        aluno.grades[3]= 8.0;

        //Métodos
        aluno.showDetails();
        
    }
}
