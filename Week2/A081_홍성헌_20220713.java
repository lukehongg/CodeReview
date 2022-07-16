package W2;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A081_홍성헌_20220713 {
	public static void run(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());
		int i=0;
		int N=3;

		Vector<Integer> A = new Vector<Integer>();
		while(i<testcase) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int a=0; a<10; a++) {
				A.add(Integer.parseInt(st.nextToken()));
			}
			A.sort(Comparator.reverseOrder());
			System.out.println(A.elementAt(N-1));
			A.clear();
			i++;
		}
	}
}
