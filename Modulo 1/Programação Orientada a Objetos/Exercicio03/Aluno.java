public class Aluno {
    
    //Atributos
    String name;
    double[] grades = new double [4];
    
    
    
    
    // Media - descricao - verificar status (aprovado ou nao) - verificar maior nota

    //Métodos
    double evalMean(){
        double mean = 0.0;
        for (int i = 0; i < this.grades.length; i++){
            mean += grades[i];
        }
        mean /= grades.length;

        return mean;
    }

    double HigherGrade(){
        double higherGrade = Double.MIN_VALUE;
        for (int i = 0; i< this.grades.length; i++){
            if(grades[i] > higherGrade){
                higherGrade = grades[i];
            }
        }
        return higherGrade;
    }

    void checkStatus(){
        double mean = evalMean();
        if (mean >= 7.0){
            System.out.println("\nO aluno foi aprovado!");
        } else {
            System.out.println("\nO aluno foi reprovado!");
        }
    }

    void showDetails(){
        System.out.println("Aluno: " + this.name);
        for (int i = 0; i < grades.length; i++){
            System.out.println("Nota " + (i + 1) +": " + grades[i]);
        }
        System.out.printf("Mean: %.2f", evalMean());
        System.out.printf("\nHigher Grade: %.2f", HigherGrade());

        checkStatus();

        System.out.println();
    }
}