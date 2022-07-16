package W2;
import java.util.*;
public class A066_홍성헌_20220712 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] arr = input.next().toCharArray();
		int n = arr.length;
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			result.add((arr[i]-'0'));
		}
		result.sort(Collections.reverseOrder());
		for(int i: result) {
			System.out.print(i);
		}
	}
}
