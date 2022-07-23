package W3;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class A123_홍성헌_20220720 {
	static int N;
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int[] dp = new int[N+1];
		dp[1] = 0;
		for(int i=2; i<=N; i++) {
			int a = 10000;
			int b = 10000;
			int c = 10000;
			if(i % 3 == 0) {
				a = dp[i/3];
			}
			if(i % 2 == 0) {
				b = dp[i/2];
			}
			c = dp[i-1];
			dp[i] = Math.min(c, Math.min(a, b)) + 1;
			
		}
		System.out.println(dp[N]);
		
	}
}
