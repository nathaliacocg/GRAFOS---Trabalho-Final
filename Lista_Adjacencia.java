import java.util.*;

class Lista_Adjacencia {
    private List<List<Aresta>> lista;
    private int num_v;
    private String[] rot_v;
    private String[] rotuloVertices;

    public Lista_Adjacencia(int num_v) {
        this.num_v = num_v;
        lista = new ArrayList<>();
        rot_v = new String[num_v];
        rotuloVertices = new String[num_v-1];
        for (int i = 0; i < num_v; i++) {
            lista.add(new ArrayList<>());
        }
    }
    public void rotularVertice(int vertice, String rotulo) {
        rotuloVertices[vertice] = rotulo;
    }
    public void adicionar_aresta(int origem, int destino, int peso) {
        lista.get(origem).add(new Aresta(destino, peso));
        lista.get(destino).add(new Aresta(origem, peso)); // Grafo não direcionado
    }

    public void remover_aresta(int origem, int destino) {
        lista.get(origem).removeIf(a -> a.destino == destino);
        lista.get(destino).removeIf(a -> a.destino == origem);
    }

    public void rot_vertice(int vertice, String rotulo) {
        rot_v[vertice] = rotulo;
    }

    public boolean existe_aresta(int origem, int destino) {
        return lista.get(origem).stream().anyMatch(a -> a.destino == destino);
    }

    public boolean adjacente(int origem, int destino) {
        return existe_aresta(origem, destino);
    }

    public boolean incidente(int vertice, int destino) {
        return existe_aresta(vertice, destino);
    }

    public int count_aresta() {
        int c = 0;
        for (List<Aresta> adj : lista) {
            c += adj.size();
        }
        return c/2;
    }

    public int count_vertice() {
        return num_v;
    }

    public boolean vazio() {
        return count_aresta() == 0;
    }

    public boolean completo() {
        for (int i = 0; i < num_v; i++) {
            if (lista.get(i).size() != num_v - 1)
                return false;
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < num_v; i++) {
            System.out.print(i + ": ");
            for (Aresta a : lista.get(i)) {
                System.out.print("(" + a.destino + ", " + a.peso + ") ");
            }
            System.out.println();
        }
    }

    private class Aresta {
        int destino, peso;
        Aresta(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }
}
