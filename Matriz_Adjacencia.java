public class Matriz_Adjacencia {
    private int[][] matriz;
    private int num_v;

    public Matriz_Adjacencia(int num_v){
        this.num_v = num_v;
        this.matriz = new int[num_v][num_v];
    }

    public void adicionar_aresta(int origem, int destino){
        matriz[origem][destino] = 1;
        //em um grafo não direcionado, é preciso adicionar as arestas em ambos os sentidos
        matriz[destino][origem] = 1;
    }

    public void remover_aresta(int origem, int destino){
        matriz[origem][destino] = 0;
        matriz[destino][origem] = 0;
    }

    public boolean existe_aresta(int origem, int destino){
        return matriz[origem][destino] == 1;
    }

    public void grafo_completo(int num_v) {
        for (int i = 0; i < num_v; i++) {
            for (int j = i + 1; j < num_v; j++) {
                adicionar_aresta(i, j);
            }
        }
    }

    public void print_matriz(){
        System.out.println("Matriz de Adjacência:");
        for(int i = 0; i<num_v; i++){
            for(int j = 0; j<num_v; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
