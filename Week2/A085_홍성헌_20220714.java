package W2;
import java.util.*;
public class A085_홍성헌_20220714 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		List<String> l = new ArrayList<String>();
		while(N-- >0) {
			l.add(input.next());
		}
		l.sort(new CompareSerial());
		for(String s: l) {
			System.out.println(s);
		}
	}
}

class CompareSerial implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		int len1, len2;
		len1 = s1.length();
		len2 = s2.length();
		if(len1 == len2) {
			int second = check(s1, s2);
			if(second == -1) {
				return s1.charAt(0) - s2.charAt(0);
			} else {
				if(second == 1) return 1;
				else return -1;
			}
		} else {
			return len1 - len2;
		}
			
	}
	public int check(String s1, String s2) {
		int sum1=0;
		int sum2=0;
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		int temp;
		for(char c: str1) {
			temp = convertoNum(c);
			if(temp != -1) {
				sum1 += temp;
			}
		}
		for(char c: str2) {
			temp = convertoNum(c);
			if(temp != -1) {
				sum2 += temp;
			}
		}
		if(sum1 == sum2) {
			return -1;
		}
		else {
			if(sum1 > sum2) return 1;
			else return 2;
		}
	}
	public int convertoNum(char c) {
		if(c>='0' && c<='9') {
			return c-'0';
		}
		else return -1;
	}
	
}