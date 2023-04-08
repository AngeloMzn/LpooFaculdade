public class Apartamento {
    
    int nMoradores;
    int nQuartos;
    double espaco;
    double valorAluguel;

    Apartamento(int nQuar, double esp, double valorAlg){

        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;

    }

    Apartamento(int nMor, int nQuar, double esp, double valorAlg){

        this.nMoradores = nMor;
        this.nQuartos = nQuar;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
 

    }

    double dividirAluguel(){

        return valorAluguel / nMoradores;

    }

    double valorporm2(){

        return valorAluguel / espaco; 

    }

    boolean aumentarMoradores(){

        if(nMoradores < nQuartos){

            nMoradores += 1;
            return true;
        
        }else{

            return false;

        }


    }

    boolean diminuirMoradores(){

        if(nMoradores > 0){

            nMoradores = nMoradores - 1;
            return true;
        }else{

            return false;

        }

    }
}
