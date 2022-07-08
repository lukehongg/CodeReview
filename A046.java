import java.util.*;

public class A046 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] count = new int[26];
		for(int i=0; i<N; i++) {
			String s = input.next();
			int idx = s.charAt(0) - 97;
			count[idx]++;
		}
		boolean lose = true;
		for(int i=0; i<count.length; i++) {
			if(count[i] >= 5) {
				lose = false;
				char c = (char)(i+97);
				System.out.print(c);
			}
		}
		if(lose) System.out.println("PREDAJA");
	}
}
