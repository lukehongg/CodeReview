package W2;
import java.util.*;
public class A084_홍성헌_20220714 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		List<String> l = new ArrayList<String>();
		for(int i=0; i<s.length(); i++) {
			l.add(s.substring(i));
		}
		l.sort(Comparator.naturalOrder());
		for(String t: l) {
			System.out.println(t);
		}
	}
}
