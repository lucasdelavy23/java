public class Main {
    public static void main ( String[] args){

        Carro model1 = new Carro();

        model1.model = "Mustang";

        model1.Status();
        System.out.println();

        model1.accelerate();
        model1.turnOn();
        System.out.println();

        model1.Status();
        System.out.println();

        model1.accelerate();
        System.out.println();
        
        model1.Status();
        System.out.println();

        model1.turnOff();
        model1.breaker();
        model1.breaker();

        model1.Status();

        model1.turnOff();
        model1.Status();
    }
}
