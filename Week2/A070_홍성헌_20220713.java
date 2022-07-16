package W2;
import java.util.*;

public class A070_홍성헌_20220713 {
	public static void run(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
