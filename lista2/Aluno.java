public class Aluno{

    String[] Disciplinas;
    String nome;
    String RGA;
    double[] medias;
    int anoDeIngresso;

    Aluno(String novoNome, String rga, int AnoIngresso){
        
        this.nome = novoNome;
        this.RGA = rga;
        this.anoDeIngresso = AnoIngresso;

    }


    Aluno(String novoNome, String rga, int AnoIngresso, String[] listaDisciplinas, double[] listaMedias){
        
        this.nome = novoNome;
        this.RGA = rga;
        this.anoDeIngresso = AnoIngresso;
        this.Disciplinas = listaDisciplinas;
        this.medias = listaMedias; 

    }
    
    int tempoDeCurso(int ano){

        int tempoDeCurso = ano - anoDeIngresso;

        return tempoDeCurso;

    }

    double devolveCoeficienteRendimento(){
        
        double soma = 0; 
        
        for(int i = 0; i < medias.length; i++){

            soma += medias[i];

        }
        
        double CR = soma/medias.length;
        
        return CR;

    }

    void imprimeNome(){

        System.out.println(nome);

    }

    boolean comparaAluno(Aluno B){

        if(B.RGA == this.RGA){

            return true;

        }else{

            return false;
        }

    }

}