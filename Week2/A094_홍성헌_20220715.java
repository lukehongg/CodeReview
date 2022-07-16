package W2;
import java.util.*;
public class A094_홍성헌_20220715 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		//List<String> croatia = new ArrayList<String>();
		List<String> croatia = new ArrayList<String>(Arrays.asList
				("c=","c-","dz=","d-","lj","nj","s=","z="));
		for(String s:croatia) {
			word = word.replace(s,"^");
		}
		System.out.println(word.length());

	}
	
}
