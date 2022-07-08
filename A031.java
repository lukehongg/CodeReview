import java.util.*;
public class A031 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		System.out.println(N*M -1);
		//(N-1) + N * (M-1)
		//=> NM -N +N -1 = NM -1 
		
	}
}
