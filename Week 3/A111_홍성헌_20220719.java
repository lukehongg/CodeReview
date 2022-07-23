package W3;
import java.util.*;
public class A111_홍성헌_20220719 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0; i<N; i++) {
			int k = input.nextInt();
			double n = 0.0;
			for(int j=0; j<k; j++) {
				n = (n+0.5) * 2;
			}
			System.out.println((int)n);
		}
	}
}
