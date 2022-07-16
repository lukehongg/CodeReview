package W2;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A047_홍성헌_20220711 {
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] word = st.nextToken().toCharArray();
		int count=0;
		for(char c: word) {
			System.out.print(c);
			count++;
			if(count%10 == 0) {
				System.out.print('\n');
			}
		}
	}
}
