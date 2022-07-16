package W2;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A053_홍성헌_20220711 {
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[n];
		int size=0;
		
		String cmd;
		while(n>0) {
			st = new StringTokenizer(br.readLine(), " ");
			cmd = st.nextToken();
			if(cmd.equals("push")) {
				stack[size++] = Integer.parseInt(st.nextToken());
			}
			else if(cmd.equals("pop")) {
				if(size==0) {
					System.out.println(-1);
				} else {
					System.out.println(stack[--size]);
				}
			}
			else if(cmd.equals("size")) {
				System.out.println(size);
			}
			else if(cmd.equals("empty")) {
				if(size==0) System.out.println(1);
				else System.out.println(0);
			}
			else if(cmd.equals("top")) {
				if(size==0) System.out.println(-1);
				else System.out.println(stack[size-1]);
			}
			n--;
		}
	}
}
