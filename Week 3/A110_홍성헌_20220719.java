package W3;
import java.util.*;
public class A110_홍성헌_20220719 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int change = 1000 - input.nextInt();
		int[] coins = {500, 100, 50, 10, 5, 1};
		int count = 0;
		for(int i=0; i<6; i++) {
			if(change >= coins[i]) {
				int n = change / coins[i];
				count += n;
				change -= (n * coins[i]);
			}
		}
		System.out.print(count);
	}
}
