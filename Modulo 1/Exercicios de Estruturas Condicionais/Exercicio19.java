public class Exercicio19 {
    public static void main (String [] args){
//   Faça um programa que leia três números e mostre o maior deles.

    int a = 4;
    int b = 18;
    int c = 3;

        if (a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}