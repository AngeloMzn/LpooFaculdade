import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        
       //Leia um número inteiro do console e imprima Par se ele for par ou Impar se ele for ímpar
       
        Scanner r = new Scanner(System.in);
        int numero;

        numero = r.nextInt();

        if(numero % 2 == 0){

            System.out.println("Par");

        }
        else{

            System.out.println("Impar");

        }

    }
}
