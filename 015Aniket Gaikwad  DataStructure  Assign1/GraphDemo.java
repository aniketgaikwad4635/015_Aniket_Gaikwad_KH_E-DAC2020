package Graph;
import java.util.ArrayList;
class Graph{
	ArrayList<ArrayList<Integer>> graph;
	int v;
	 
	Graph(int node){
		v=node;
		graph=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			graph.add(new ArrayList<Integer>());
		}	
	}
	void addEdge(int v,int u) {
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	void print() {
		for(int i=0;i<v;i++) {
			System.out.print("NOde "+i);
		  for(int x: graph.get(i)) {
			  System.out.print(x+"> ");
		  }	
		  System.out.println();
		}
	}
}
public class GraphDemo {

	public static void main(String[] args) {
		Graph gh=new Graph(5);
		gh.addEdge(0, 1);
		gh.addEdge(3, 2);
		gh.addEdge(2, 4);
		gh.addEdge(1, 4);
		gh.addEdge(3, 1);
		gh.addEdge(2, 0);
        gh.print();
	}

}
