public class Pessoa {
    //Atributos
    private String name;
    private int age;

    //Métodos
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge (int age){
        if (age > 0) {
            this.age = age;
        }else{
            System.out.println("Idade inválida!");
        }
    }

    void presentacion (){
        System.out.println("Olá, meu nome é " + getName() + " e eu tenho " + getAge() + " anos.\n");
    }
}
