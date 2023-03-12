import java.util.Scanner;
import java.lang.Math;
public class Ex6 {
    public static void main(String [] args){

        Scanner r = new Scanner(System.in);
        int nLinhas, cont, raiz;
        
        nLinhas = r.nextInt();
        cont = 0;
        int numeros[] = new int[nLinhas];

        while(cont < nLinhas){
            
            numeros[cont] = r.nextInt(); 
            cont++;

        }

        for(int i = 0; i < nLinhas; i++){
            
            raiz = (int)Math.sqrt(numeros[i]);
           
            if(raiz * raiz == numeros[i]){

                System.out.println(numeros[i]);

            }

        }

    }
}
