public class Matriz {
    
    int n, m;

    double[][] M;

    Matriz(double[][] valores){
       copiaMatriz(valores);

    }

    Matriz(int n_, int m_){

        this.n = n_;
        this.m = m_;
        this.M = new double[n_][m_];
        for(int i = 0; i < n_; i++){

            for(int j = 0; j < m_; j++){
                
                M[i][j] = 0;
            
            }

        }

    }

    public Matriz somaMatriz(Matriz B) {
        if (n != B.n || m != B.m) {
            return null;
        }
        Matriz C = new Matriz(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C.M[i][j] = M[i][j] + B.M[i][j];
            }
        }
        return C;
    }

    public Matriz multiplicaMatriz(Matriz B) {
        if (m != B.n) {
            return null;
        }
        Matriz C = new Matriz(n, B.m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < B.m; j++) {
                for (int k = 0; k < m; k++) {
                    C.M[i][j] += M[i][k] * B.M[k][j];
                }
            }
        }
        return C;
    }
    
    public void imprimeMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(this.M[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    boolean ehQuadrada(){
        if(this.n == this.m){

            return true;

        }
        else{

            return false;

        }
        
        

    }

    public void copiaMatriz(double[][] valores) {
        this.n = valores.length;
        this.m = valores[0].length;
        this.M = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.M[i][j] = valores[i][j];
            }
        }
    }
}
