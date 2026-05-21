public class Carro {
    //Atributos

    String model;
    int velocity = 0;
    boolean isOn = false;

    //Métodos

    void turnOn (){
        
        if (!this.isOn){
            this.isOn = true;
            System.out.println("O carro foi ligado.");
        } else{
        System.out.println("O carro já está ligado.");
        }
    }

    void turnOff (){
        if (this.isOn && this.velocity == 0){
            this.isOn = false;
            System.out.println("O carro foi desligado");
        }else if (!this.isOn){
            System.out.println("O carro já está desligado.");
        }else{
            System.out.println("O carro está em movimento e não pode ser desligado, reduza para zero para desligar o carro.");
        }
    }

    void accelerate(){
        if (!this.isOn){
            System.out.println("O carro não pode ser acelerado pois o carro está desligado. Ligue o carro para acelerar.");
        }else {
        this.velocity += 50;
        System.out.println("Nova velocidade: " + this.velocity + " km/h.");
        }
    }

    void breaker(){
        if (velocity == 0){
            System.out.println("O carro não pode diminuir a velocidade pois já está parado.");
        }else{
            this.velocity -= 50;
            System.out.println("Nova velocidade: " + this.velocity + " km/h.");
        }
    }

    void Status(){
        System.out.println("Modelo do carro: " + this.model);
        System.out.println("Velocidade atual: " + this.velocity + " km/h.");

        if (isOn){
            System.out.println("O carro está ligado.");
        } else{
            System.out.println("O carro está desligado.");
        }
    }
}