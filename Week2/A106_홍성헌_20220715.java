package W2;
import java.util.*;
public class A106_홍성헌_20220715 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int total = 0;
		for(int i=0; i<26; i++) {
			total += (i+65);
		}
		while(N-- > 0) {
			char[] word = input.next().toCharArray();
			int sum = total;
			int len = word.length;
			boolean[] check = new boolean[26];
			for(int i=0; i<len; i++) {
				if(!check[word[i]-65]) {
					check[word[i]-65] = true;
					sum -= (int)word[i];
				}
			}
			System.out.println(sum);
		}
		
		
	}
}
