package W3;
import java.util.*;
public class A113_홍성헌_20220720 {

	static int V;
	static int E;
	static boolean[][] adj;
	static boolean[] visited;
	
	
	
	public static void run(String[] args) {
		Scanner input= new Scanner(System.in);
		V= input.nextInt();
		E = input.nextInt();
		visited = new boolean[V+1];
		adj = new boolean[V+1][V+1];
		
		for(int i=0; i<E; i++) {
			int f = input.nextInt();
			int t = input.nextInt();
			adj[f][t] = true;
			adj[t][f] = true;
		}
		
		int count = 0;
		
		for(int i=1; i<=V; i++) {
			if(!visited[i]) {
				count++;
				go(i);
			}
		}
		System.out.println(count);
		
	}
	static void go(int from ) {
		visited[from] = true;
		for(int j=1; j<=V; j++) {
			if(adj[from][j] && !visited[j]) {
				go(j);
			}
		}
	}
}
