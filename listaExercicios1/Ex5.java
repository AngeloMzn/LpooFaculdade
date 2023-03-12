import java.util.Scanner;;
public class Ex5 {
    public static void main(String [] args){

        Scanner r = new Scanner(System.in);

        int numero;
        int soma = 0;

        numero = r.nextInt();

        for(int i = 1; i <=1000; i++){

            if(i % numero == 0){

                soma += i;

            }

        }
        
        System.out.println(soma);

    }
}
