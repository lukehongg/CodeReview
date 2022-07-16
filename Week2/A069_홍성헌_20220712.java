package W2;

import java.util.*;

public class A069_홍성헌_20220712 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int size = N;
		int index = 0;

		Vector<Integer> joseph = new Vector<Integer>();
		Vector<Integer> result = new Vector<Integer>();
		int i=1;
		while(i<=N) {
			joseph.add(i++);
		}
		while(!joseph.isEmpty()) {
			index = (index + K) % size;
			result.add(joseph.elementAt(index));
			joseph.remove(index);
			size--;
		}
		System.out.print("<");
		for(int j=0; j<N; j++) {
			if(j==N-1) {
				System.out.print(result.elementAt(j));
			} else {
				System.out.print(result.elementAt(j) + ", ");
			}
		}
		System.out.print(">");
	}
}
