import java.util.ArrayList;
class dfs{
    ArrayList<ArrayList<Integer>> adjlist=new ArrayList<ArrayList<Integer>>();
    dfs(int v){
        for(int i=0;i<v;i++){
            adjlist.add(new ArrayList<Integer>());
        }
    }
    public void addList(int u,int v){
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
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