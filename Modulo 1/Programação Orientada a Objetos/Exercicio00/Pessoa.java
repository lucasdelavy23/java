public class Pessoa {
    String name;
    int age;
    double height;
    double weight;

    double imc() {
        return this.weight / (this.height * this.height);
    }

    void presentation() {
        System.out.println("Hello, my name is " + this.name);
    }
}