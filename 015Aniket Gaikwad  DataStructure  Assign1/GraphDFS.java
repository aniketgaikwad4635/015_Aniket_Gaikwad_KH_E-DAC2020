package G;

import java.util.ArrayList;

class graphdfss{
	ArrayList<ArrayList<Integer>> graphd;
	int v;
	 
	graphdfss(int node){
		v=node;
		graphd=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			graphd.add(new ArrayList<Integer>());
		}	
	}
	void addEdge(int v,int u) {
		graphd.get(v).add(u);
		graphd.get(u).add(v);
	}
	void dfs(int start) {
		boolean visited[]=new boolean[v];
		 System.out.println("DFS tranverse");
		 dfsutil(start,visited);
	}
	 void dfsutil(int node,boolean visited[]) {
		 visited[node]=true;
		 System.out.print(node+" ");
		 for(int x: graphd.get(node)) {
			 if(visited[x]==false) {
				 dfsutil(x,visited);
			 }
		 }
	 }
}	
public class GraphDFS {

	public static void main(String[] args) {
		graphdfss ghd=new graphdfss(5);
		ghd.addEdge(0, 1);
		ghd.addEdge(3, 2);
		ghd.addEdge(2, 4);
		ghd.addEdge(1, 4);
		ghd.addEdge(3, 1);
		ghd.addEdge(2, 0);
        ghd.dfs(0);

	}

}
