import java.util.*;
import java.util.LinkedList;

public class Lista_Adjacencia {
    private int num_v;
    private LinkedList <Integer>[] lista;

    public Lista_Adjacencia(int num_v){
        this.num_v = num_v;
        this.lista = new LinkedList[num_v];
    }

    public void adicionar_aresta(int origem, int destino){
        lista[origem].add(destino);
        lista[destino].add(origem);
    }

    public void remover_aresta(int origem, int destino){
        lista[origem].remove(destino);
        lista[destino].remove(origem);
    }

    public boolean existe_aresta(int origem, int destino){
        return lista[origem].contains(destino);
    }

    public void grafo_completo(int num_v) {
        for (int i = 0; i < num_v; i++) {
            for (int j = i + 1; j < num_v; j++) {
                adicionar_aresta(i, j);
            }
        }
    }

    public void checa_completo() {
        for (int i = 0; i < num_v; i++) {
            if (lista[i].size() != num_v - 1) {
                System.out.println("O grafo não é completo.");
                return;
            }
        }
        System.out.println("O grafo é completo.");
    }


    public void checa_vazio() {
        for (int i = 0; i < num_v; i++) {
            if (!lista[i].isEmpty()) {
                System.out.println("O grafo não é vazio.");
                return;
            }
        }
        System.out.println("O grafo é vazio.");
    }

    

    public void print_lista(){
        for(int i = 0; i<num_v; i++){
            System.out.print("Vértice" + i + ": ");
            for(Integer adj : lista[i]){
                System.out.print(adj + " ");
            }
            System.out.println();
        }
    }

}
