package G;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class graphbfs{
	ArrayList<ArrayList<Integer>> graphb;
	int v;
	 
	graphbfs(int node){
		v=node;
		graphb=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			graphb.add(new ArrayList<Integer>());
		}	
	}
	void addEdge(int v,int u) {
		graphb.get(v).add(u);
		graphb.get(u).add(v);
	}
	void bfs(int start) {
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.add(start);
		boolean visited[]=new boolean[v];
		visited[start]=true;
		 System.out.println("BFS tranverse");
		 
		 while(q.isEmpty()!=true) {
			 
				 int node=q.poll();
				 System.out.print(node+" ");
				 for(int x:graphb.get(node)) {
				 if(visited[x]==false) {
					 visited[x]=true;
					 q.add(x);
				 }
			 }
		 }
	}
}	
public class GraphBfsDemooo {

	public static void main(String[] args) {
		graphbfs ghd=new graphbfs(5);
		ghd.addEdge(0, 1);
		ghd.addEdge(3, 2);
		ghd.addEdge(2, 4);
		ghd.addEdge(1, 4);
		ghd.addEdge(3, 1);
		ghd.addEdge(2, 0);
        ghd.bfs(0);

	}

}

