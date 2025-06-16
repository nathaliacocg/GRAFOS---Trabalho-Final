class Matriz_Adjacencia {
    private int[][] matriz;
    private int num_v;
    private String[] rot_v;
    private String[] rotuloVertices;

    public Matriz_Adjacencia(int num_v) {
        this.num_v = num_v;
        matriz = new int[num_v][num_v];
        rotuloVertices = new String[num_v-1];
        rot_v = new String[num_v];
    }

    public void adicionar_aresta(int origem, int destino, int peso) {
        matriz[origem][destino] = peso;
        matriz[destino][origem] = peso; // Grafo não direcionado
    }

    public void remover_aresta(int origem, int destino) {
        matriz[origem][destino] = 0;
        matriz[destino][origem] = 0;
    }
    public void rotularVertice(int vertice, String rotulo) {
        rotuloVertices[vertice] = rotulo;
    }
    public void rot_vertice(int vertice, String rotulo) {
        rot_v[vertice] = rotulo;
    }

    public boolean existe_aresta(int origem, int destino) {
        return matriz[origem][destino] != 0;
    }

    public boolean adjacente(int origem, int destino) {
        return existe_aresta(origem, destino);
    }

    public boolean incidente(int vertice, int destino) {
        return matriz[vertice][destino] != 0 || matriz[destino][vertice] != 0;
    }

    public int count_aresta() {
        int cont = 0;
        for (int i = 0; i < num_v; i++) {
            for (int j = i+1; j < num_v; j++) {
                if (matriz[i][j] != 0) cont++;
            }
        }
        return cont;
    }

    public int count_vertice() {
        return num_v;
    }

    public boolean vazio() {
        return count_aresta() == 0;
    }

    public boolean completo() {
        for (int i = 0; i < num_v; i++) {
            for (int j = 0; j < num_v; j++) {
                if (i != j && matriz[i][j] == 0) return false;
            }
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < num_v; i++) {
            for (int j = 0; j < num_v; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
