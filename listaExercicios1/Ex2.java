import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        double nota1, nota2, soma, media;

        nota1 = r.nextDouble();
        nota2 = r.nextDouble();

        soma = nota1 + nota2;

        media = soma / 2; 

        if(media >= 6){

            System.out.println("Aprovado");

        }
        else{

            System.out.println("Reprovado");

        }

    }
    
}
