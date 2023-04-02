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

public class Turma{

    Aluno[] listaAlunos;
    String disciplina;
    int anoVigente;

    Turma(int nAlunos, int anoVigente, String disciplina, String[] nomes, String[] rgas, double[] medias){

        
        this.listaAlunos = new Aluno[nAlunos];
        this.anoVigente = anoVigente; 
        String[] disciplinas = new String[1];
        
        disciplinas[0] = disciplina;
        this.disciplina = disciplinas[0];
        
        
        for(int i = 0; i < nAlunos; i++){
            double[] media = new double[1];
            media[0] = medias[i]; 
            this.listaAlunos[i] = new Aluno(nomes[i], rgas[i], anoVigente, disciplinas, media);
            
        }
        

    }
    
    void melhorMedia(){
        double maior = 0;
        int posicaoDoMaior = 0;
        for(int i = 0; i < listaAlunos.length; i++){

                if(listaAlunos[i].medias[0] > maior){

                    maior = listaAlunos[i].medias[0];
                    posicaoDoMaior = i;

            }
        
        }

        System.out.println(listaAlunos[posicaoDoMaior].nome);
    }

}
