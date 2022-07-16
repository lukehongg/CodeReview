package W2;
import java.util.*;
public class A051_홍성헌_20220711 {
	public static void run(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char[] word = input.next().toCharArray();
		int sum=0;
		for(char c: word) {
			sum += (c-'A')/3 + 3;
			if(c=='S' || c=='V'|| c=='Y' ||c=='Z') {
				sum--;
			}
		}
		System.out.println(sum);
	}
}
