public class Carro{

    String modelo;
    int nPortas;
    int nPassageiros;
    double velocidade;
    boolean estaLigado;

    Carro(String mod, int nP, int nPas){
       
        this.modelo = mod;
        this.nPortas = nP;
        this.nPassageiros = nPas;

    }

    void ligaCarro(){

        estaLigado = true;

    }

    void acelerar(double novaV){

        if(estaLigado){

            this.velocidade += novaV;

        }

    }

    void frear(){

         this.velocidade = 0;

    }

    String devolveInformacoes(){

        return String.format("Carro de modelo %s com %d passageiros", this.modelo, this.nPassageiros );

    }

    
}