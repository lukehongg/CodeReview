import java.util.*;

public class A045 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next().toUpperCase();
		int[] count = new int[26];
		for(int i=0; i<s.length(); i++) {
			int idx = s.charAt(i) - 'A';
			count[idx]++;
		}
		
		int max =0;
		char c = '?';
		for(int i=0; i<26; i++) {
			if(count[i] > max) {
				max = count[i];
				c = (char)(i+65);
			}
			else if(count[i] == max) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}
