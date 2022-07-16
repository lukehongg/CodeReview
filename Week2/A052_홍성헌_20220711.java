package W2;
import java.util.*;
public class A052_홍성헌_20220711 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int local=0;
		int result=0;
		char[] ox;
		
		while(n>0) {
			ox = input.next().toCharArray();
			for(char c: ox) {
				if(c=='O') {
					local++;
				}
				else {
					local = 0;
				}
				result += local;
			}
			System.out.println(result);
			result=0;
			n--;
		}
		
	}
}
