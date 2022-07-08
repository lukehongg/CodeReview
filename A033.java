import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class A033 {
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sum = new int[5];
		int max_sum=0;
		int max_idx=0;
		for(int i =0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j =0; j<4; j++) {
				sum[i] += Integer.parseInt(st.nextToken());
			}
			if(sum[i] > max_sum) {
				max_sum = sum[i];
				max_idx = i;
			}
		}
		System.out.println((max_idx+1) + " " + max_sum);
	}
}
