class GraphRepresentation{
    public static void main(String args[]){
        /*int[][] graph={       Eg : Graph To Understanding ...
           0 {0,1,0,0,1},
           1 {1,0,1,0,1},
           2 {0,1,0,1,0},
           3 {0,0,1,0,1},
           4 {1,1,0,1,0}
        };*/
        Graph g=new Graph(5);

        g.addList(0, 1);
        g.addList(0, 4);
        g.addList(1, 4);
        g.addList(1, 2);
        g.addList(2, 3);
        g.addList(3, 4);

        g.PrintList();
        //g.bfs(0);
        g.dfs(0);
    }
}