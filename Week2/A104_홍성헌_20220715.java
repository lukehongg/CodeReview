package W2;
import java.util.*;
public class A104_홍성헌_20220715 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<N; i++){
			pq.offer(input.nextInt());
		}
		int sum = 0;
		pq.poll();
		while(pq.size() > 0) {
			sum += pq.poll();
		}
		System.out.println(sum);
	
	}
}
