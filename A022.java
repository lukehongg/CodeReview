import java.util.*;
public class A022 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int Y = 0, M = 0;
		int n;
		
		for(int i=0; i<N; i++) {
			int temp = input.nextInt() + 1;
			
			Y += 10 * ((temp / 30) + 1);
			M += 15 * ((temp / 60) + 1);
		}
		if(Y==M) {
			System.out.print("Y M "+Y);
		}
		else if(Y>M) {
			System.out.print("M " + M);
		}else {
			System.out.print("Y " + Y);
		}
		
		
	}
}
