package W2;
import java.util.*;
public class A065_홍성헌_20220712 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] coor = new int[n][2];
		for(int i=0; i<n; i++) {
			coor[i][0] = input.nextInt();
			coor[i][1] = input.nextInt();
		}
		Arrays.sort(coor, (n1, n2) -> {
			if(n1[0] == n2[0]) {
				return n1[1] - n2[1];
			} else {
				return n1[0] - n2[0];
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(coor[i][0] + " " + coor[i][1]);
		}
		
	}
}
