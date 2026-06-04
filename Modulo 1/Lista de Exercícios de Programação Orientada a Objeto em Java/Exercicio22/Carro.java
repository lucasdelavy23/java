package Exercicio22;

public class Carro {
    // Atributos
    String model;
    int maxSpeed;
    int currentSpeed = 0;

    // Metodos

    public Carro(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void showSpeed() {
        System.out.println("Velocidade Atual: " + this.currentSpeed + " Km/H");
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed += 10;
        } else {
            System.out.println("Velocidade Máxima atingida.");
        }
    }

    public void breaker() {
        if (currentSpeed > 0) {
            currentSpeed -= 10;
        } else {
            System.out.println("O carro já está parado!");
        }
    }

}
