import java.util.Scanner;;
public class Ex4 {
    public static void main(String [] args){

        /*  Queremos escrever um programa que simula uma calculadora simples.



            Essa calculadora deve ser capaz de receber diversas operações e realizá-las em sequência.



            As operações devem ser realizadas entre dois valores double, e o resultado deve ser impresso na tela logo após cada operação é lida.

            As operações possíveis são soma ("+"), subtração ("-"), multiplicação ("*") e divisão ("/").



            O final do programa é sinalizado quando a operação lida é um "x".

         */




        Scanner r = new Scanner(System.in);
        double numero1, numero2;
        char operador;
        
        while(true){
            
             numero1 = r.nextDouble(); System.out.printf("");  operador = r.next().charAt(0); System.out.printf(""); numero2 = r.nextDouble();

            switch(operador){
                case '+':

                    System.out.println(numero1 + numero2);
                    break;
                case '-':

                    System.out.println(numero1 - numero2);
                    break;
                
                case '/':

                    System.out.println(numero1 / numero2);
                    break;
                
                case '*':

                    System.out.println(numero1 * numero2);
                    break;

            }

            if(operador =='x'){

                break;

            }

        }
        
    }
}
