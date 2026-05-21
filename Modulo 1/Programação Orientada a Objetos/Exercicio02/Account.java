public class Account {
    String holder;
    double balance = 0.0;

    void description() {
        System.out.println("\nNome do titular da conta: " + this.holder);
        System.out.printf("Saldo da conta: R$ %.2f\n", this.balance);
    }

    void withdraw (double value) {
        if (value <= balance) {
           this.balance -= value;
        }else{
            System.out.println("Valor de saque inválido.");
            return;
        }
    }

    void deposit (double value){
        if (value > 0){
            this.balance += value;
        }else{
            System.out.println("Valor de depósito inválido.");
            return;
        }
    }

}
