import java.util.*;

public class A018 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		//A008
		int N = input.nextInt();
		
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			int temp = input.nextInt();
			A[i] = temp;
		}
		Arrays.sort(A);
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int j=0; j<N; j++) {
			pq.add(input.nextInt());
		}
		int sum=0;
		for(int k=0; k<N; k++) {
			int a = A[k];
			int b = pq.poll();
			sum += a * b;
		}
		System.out.println(sum);		
	}	

}
