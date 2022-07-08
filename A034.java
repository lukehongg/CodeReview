import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class A034 {
	public static void run(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Scanner input = new Scanner(System.in);
		boolean[] check = new boolean[42];
		for(int i=0; i<10; i++) {
			int idx = (input.nextInt() % 42);
			check[idx] = true;
		}
		int count =0;
		for(int i=0; i<42; i++) {
			if(check[i] == true) count++;
		}
		System.out.println(count);
		
	}
}
