package W3;
import java.util.*;
public class A108_홍성헌_20220719 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=0; i<N; i++) {
			System.out.println(check(input.next()));
		}
		
		
	}
	private static String check(String in) {
		String result="YES";
		int len = in.length();
		String B="";
		for(int i=len-1; i>=0; i--) {
			B = B + in.charAt(i);
		}
		int sum;
		if(in.length() == 1) {
			sum = Integer.parseInt(in);
		} else {
			sum = Integer.parseInt(in) + Integer.parseInt(B);
		}
		String sumString = Integer.toString(sum);
		int sumLEN = sumString.length();
		for(int i=0; i< sumLEN/2;i++) {
			if(sumString.charAt(i) != sumString.charAt(sumLEN-i-1)) {
				result = "NO";
				break;
			}
		}
		return result;
	}
}
