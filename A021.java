import java.util.Scanner;
public class A021 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] taps = new int[N];
		for(int i=0; i<N; i++) {
			taps[i] = input.nextInt();
		}
		int count = 1;
		for(int i=0; i<N; i++) {
			count--;
			count += taps[i];
		}
		System.out.println(count);
	}
}
