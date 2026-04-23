public class Exercicio6 {
    public static void main (String [] args){
        //Faça um programa que leia um número e verifique se ele é raiz da equação 𝑥3 + 17𝑥2 +80𝑥 = 0. Caso seja raiz, o programa deveretornar o valor 1; caso contrário, deve retornar o valor 0.
        double valor = 0;

        if ( (valor*valor*valor)+((17*(valor*valor))+(80*valor)) == 0){
            System.out.println("1");
        } else{
            System.out.println("0");
        }
        
    }
}
