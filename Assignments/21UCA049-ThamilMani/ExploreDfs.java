class ExploreDfs{
    public static void main(String args[]){
        dfs d=new dfs(5);
        d.addList(0, 1);
        d.addList(0, 4);
        d.addList(1, 4);
        d.addList(1, 2);
        d.addList(2, 3);
        d.addList(3, 4);
        d.dfs(0);
    }
}