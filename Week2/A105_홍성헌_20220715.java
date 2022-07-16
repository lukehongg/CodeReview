package W2;
import java.util.*;
public class A105_홍성헌_20220715 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int line=0;
		int max_in_line=0;
		while(max_in_line < N) {
			line++;
			max_in_line += line;
		}
		int count = max_in_line - N;
		int i,j;
		if(line % 2 == 0) {
			i = line - count;
			j = 1 + count;
		} else {
			i = 1 + count;
			j = line - count;
		}
		System.out.println(i+"/"+j);
		
	}
}
