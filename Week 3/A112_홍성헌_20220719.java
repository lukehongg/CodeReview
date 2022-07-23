package W3;
import java.util.*;
public class A112_홍성헌_20220719 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int B = input.nextInt();
		int p1 = 1001;
		int p2 = 1001;
		int result;
		for(int i=0; i< B; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			p1 = Math.min(p1, a);
			p2 = Math.min(p2, b);
		}
		if(p1 > p2 * 6) {
			result = p2 * N;
		}else {
			if(N<=6) result = p1;
		        else {
		            if(N%6 == 0) result = p1 * (N/6);
		            else {
		                int temp = N/6;
		                int temp2 = N%6;
		                result = Math.min(p1*(temp+1), p1*temp + p2 * temp2);
		            }
		        }
		}
		System.out.println(result);

	}
}
