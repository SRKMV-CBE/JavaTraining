import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph{ArrayList<ArrayList<Integer>> adjlist=new ArrayList<ArrayList<Integer>>();
    Graph(int v){
        for(int i=0;i<v;i++){
            adjlist.add(new ArrayList<Integer>());
        }
    }
    public void addList(int u,int v){
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }
    
    public void PrintList(){
        for(int i=0;i<adjlist.size();i++){//i-vertex is 5...
            System.out.println("Adj List Of Vertex : "+i);
            for(int j=0;j<adjlist.get(i).size();j++){
                System.out.print(" "+adjlist.get(i).get(j));
            }
            System.out.println();
            System.out.println("Size : "+adjlist.get(i).size());
            System.out.println();
        }
        System.out.println("Size Of List : "+adjlist.size());
    }
    public void bfs(int v){
        int V=adjlist.size();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(v); 
        visited[v]=true;
        while(q!=null){
            int vertex=q.remove();
            System.out.println("bfs Vertex : "+vertex);
            for(int i=0;i<adjlist.get(vertex).size();i++){
                int av=adjlist.get(vertex).get(i);
                if(!visited[av]){
                    q.add(av);
                    visited[av]=true;
                }
            }
        }
    }
    public void dfs(int v){
        int V=adjlist.size();
        boolean[] visited=new boolean[V];
        dfs2(v,visited);
    }
    public void dfs2(int v,boolean[] visited){
        visited[v]=true;
        System.out.println("Visited Vertex Of DFS : "+v);
            for(int i=0;i<adjlist.get(v).size();i++){
                int av=adjlist.get(v).get(i);
                if(!visited[v])
                    dfs(av);                
            }
        }
}