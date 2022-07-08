import java.util.*;
public class A029 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int first = input.nextInt();
		
		if(N >= 6) {
			System.out.println("Love is open door");
		}
		else {
			int second;
			if(first == 1)  second = 0;
			else second = 1;
			for(int i=2; i<=N; i++) {
				if(i % 2 == 0) {
					System.out.println(second);
				}else {
					System.out.println(first);
				}
			}
		}
		
	}

}
