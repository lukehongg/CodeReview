package W3;
import java.util.*;

public class A107_홍성헌_20220719 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int[] sum = new int[1001];
		int count=0;
		int n = 1;
		sum[0] = 0;
		while(count < 1000) {
			for(int j=0; j<n; j++) {
				count++;
				sum[count]=sum[count-1]+n;
				if(count == B) {
					break;
				}
			}
			if(count >= B) break;
			n++;
		}
		System.out.println(sum[B]- sum[A-1]);
	}
}
