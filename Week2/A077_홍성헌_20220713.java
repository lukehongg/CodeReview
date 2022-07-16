package W2;
import java.util.*;
public class A077_홍성헌_20220713 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0; i<8; i++) {
			int temp = input.nextInt();
			v.add(temp);
			pq.offer(temp);
		}
		int sum=0;
		List<Integer> index = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			int temp = pq.poll();
			index.add(v.indexOf(temp) + 1);
			sum+=temp;
		}
		index.sort(Comparator.naturalOrder());
		System.out.println(sum);
		for(int i: index) {
			System.out.print(i + " ");
		}
		
	}
}
