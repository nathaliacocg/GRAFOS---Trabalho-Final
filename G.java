import java.util.*;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número de vértices: ");
        int n = sc.nextInt();

        System.out.println("Escolha a representação: 1 - Matriz | 2 - Lista");
        int escolha = sc.nextInt();
        
        if (escolha == 1) {
            Matriz_Adjacencia matriz = new Matriz_Adjacencia(n);
            menuMatriz(sc, matriz);
        } else {
            Lista_Adjacencia lista = new Lista_Adjacencia(n);
            menuLista(sc, lista);
        }
        sc.close();
    }

    public static void menuMatriz(Scanner sc, Matriz_Adjacencia matriz) {
        int opcao;
        do {
            System.out.println("\n--- Menu Matriz ---");
            System.out.println("1 - Adicionar Aresta");
            System.out.println("2 - Remover Aresta");
            System.out.println("3 - Rotular Vértice");
            System.out.println("4 - Imprimir");
            System.out.println("5 - Verificar Aresta");
            System.out.println("6 - Verificar Completo");
            System.out.println("7 - Verificar Vazio");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Origem: "); int o = sc.nextInt();
                    System.out.print("Destino: "); int d = sc.nextInt();
                    System.out.print("Peso: "); int p = sc.nextInt();
                    matriz.adicionar_aresta(o, d, p);
                    break;
                case 2:
                    System.out.print("Origem: "); o = sc.nextInt();
                    System.out.print("Destino: "); d = sc.nextInt();
                    matriz.remover_aresta(o, d);
                    break;
                case 3:
                    System.out.print("Vértice: "); o = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Rótulo: "); String r = sc.nextLine();
                    matriz.rot_vertice(o, r);
                    break;
                case 4:
                    matriz.print();
                    break;
                case 5:
                    System.out.print("Origem: "); o = sc.nextInt();
                    System.out.print("Destino: "); d = sc.nextInt();
                    System.out.println("Existe aresta: " + matriz.existe_aresta(o,d));
                    break;
                case 6:
                    System.out.println("Grafo completo: " + matriz.completo());
                    break;
                case 7:
                    System.out.println("Grafo vazio: " + matriz.vazio());
                    break;
            }
        } while(opcao != 0);
    }

    public static void menuLista(Scanner sc, Lista_Adjacencia lista) {
        int opcao;
        do {
            System.out.println("\n--- Menu Lista ---");
            System.out.println("1 - Adicionar Aresta");
            System.out.println("2 - Remover Aresta");
            System.out.println("3 - Rotular Vértice");
            System.out.println("4 - Imprimir");
            System.out.println("5 - Verificar Aresta");
            System.out.println("6 - Verificar Completo");
            System.out.println("7 - Verificar Vazio");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Origem: "); int o = sc.nextInt();
                    System.out.print("Destino: "); int d = sc.nextInt();
                    System.out.print("Peso: "); int p = sc.nextInt();
                    lista.adicionar_aresta(o, d, p);
                    break;
                case 2:
                    System.out.print("Origem: "); o = sc.nextInt();
                    System.out.print("Destino: "); d = sc.nextInt();
                    lista.remover_aresta(o, d);
                    break;
                case 3:
                    System.out.print("Vértice: "); o = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Rótulo: "); String r = sc.nextLine();
                    lista.rot_vertice(o, r);
                    break;
                case 4:
                    lista.print();
                    break;
                case 5:
                    System.out.print("Origem: "); o = sc.nextInt();
                    System.out.print("Destino: "); d = sc.nextInt();
                    System.out.println("Existe aresta: " + lista.existe_aresta(o,d));
                    break;
                case 6:
                    System.out.println("Grafo completo: " + lista.completo());
                    break;
                case 7:
                    System.out.println("Grafo vazio: " + lista.vazio());
                    break;
            }
        } while(opcao != 0);
    }
}
