public class Questao08 {
    public static void main(String[] args) {
        
        /*int soma = 0;                             Neste código o valor impresso na tela é 10, pois a cada vez o que o loop gira, a variável soma recebe o valor de i,
        for (int i = 1; i <= 10; i++){              sendo assim no ultimo loop, o contando "i" está em 10 e esse valor é passado para a soma, a qual é impressa na tela.
            soma = i;
        }
        System.out.println(soma);
        */

        int soma = 0;                            
        for (int i = 1; i <= 10; i++){             
            soma = soma + i;
        }
        System.out.println(soma);
        }
}
