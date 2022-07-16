package W2;
import java.util.*;
public class A083_홍성헌_20220714 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean[] check = new boolean[1001];
		boolean[] check2 = new boolean[1001];
		Vector<Integer> num = new Vector<Integer>();
		while(N-- >0) {
			int temp = input.nextInt();
			if(temp >= 0) {
				if(!check[temp]) {
					check[temp] = true;
					num.add(temp);
				}
			}
			else {
				if(!check2[(temp * -1)]) {
					check2[(temp * -1)] = true;
					num.add(temp);
				}
			}
			
		}
		num.sort(Comparator.naturalOrder());
		for(int i: num) {
			System.out.print(i + " ");
		}
	}
}
