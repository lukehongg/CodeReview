import java.util.*;

public class A019 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B, C;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		int num = (A * B * C);
		int[] array = new int[10];
		
		while(num > 0) {
			int temp = num % 10;
			num /= 10;
			array[temp]++;
		}
		for(int i=0; i<10; i++) {
			System.out.println(array[i]);
		}
		
	}	

}
