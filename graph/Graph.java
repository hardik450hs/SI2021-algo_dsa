package graph;

import java.util.*;


public class Graph {
    private LinkedList<Integer> adj[];

    public Graph(int Nodes){
        adj = new LinkedList[Nodes];
        for(int i =0;i<Nodes;i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int sorce,int dest){
        adj[sorce].add(dest);
        adj[dest].add(sorce);
    }

    
    public int bfs(int sorce, int dest){
        int parent[]=new int[adj.length];
        boolean visited[]=new boolean[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(sorce);
        visited[sorce]=true;
        parent[sorce]=-1;
        
        while(!q.isEmpty()){
            int current = q.poll();
            if(current==dest) break;
            for(int i :adj[current]){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                    parent[i]=current;
                }
            }
        }

        int curr = dest;
        int dist = 0;
        while(parent[curr]!=-1){
            System.out.print(curr +" -> ");
            curr=parent[curr];
            dist++;
        }
        System.out.print(curr);
        return dist;
    }


    public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(cur == destination) return true;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		
		return false;
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
        System.out.println("Enter Source and Destination");
        int sorce=sc.nextInt();
        int dest =sc.nextInt();
        int dist=g.bfs(sorce,dest);
        System.out.println("Minimum Distance: "+dist);
        sc.close();
    }
}

