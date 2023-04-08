public class Produto {
    
    String nome;
    double valor;
    double peso;
    int quantidade;

    Produto(String nNome, double nValor, double nPeso){

        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;

    }

    Produto(String nNome, double nValor, double nPeso, int quant){

        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
        this.quantidade = quant;       

    }

    double devolveValorAgregado(){

        return quantidade * valor;

    }

    double devolvePesoAgregado(){

        return peso * quantidade;

    }

    double converteEmDolares(double cotacaoUSD){

       return cotacaoUSD * this.valor;

    }


}
