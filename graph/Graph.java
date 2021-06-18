package graph;

import java.util.Scanner;

public class Graph {
    private LinkedList<Integer> adj[];

    public Graph(int Nodes){
        adj = new LinkedList[Nodes];
        for(int i =0;i<Nodes;i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int sorce,int dest){
        adj[sorce].Insert(dest);
        adj[dest].Insert(sorce);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices and edges");

        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        Graph g = new Graph(vertices);

        System.out.println("Input " +edges +" Edges connected vertices between 0 to " +(vertices-1));
        for(int i = 0;i<edges;i++){
            int sorce = sc.nextInt();
            int dest = sc.nextInt();
            g.addEdge(sorce, dest);
        }

        sc.close();
    }
}

