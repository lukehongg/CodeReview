package W2;
import java.util.*;
public class A086_홍성헌_20220714 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		int N = input.nextInt();
		List<Integer> l = new ArrayList<Integer>();
		while(M <= N) {
			l.add(M);
			M++;
		}
		Collections.sort(l, new CompareNum());
		for(int i: l) {
			System.out.print(i + " ");
		}
		int i=0;
		for(int n: l){
		    i++;  
		    if(i == l.size()) System.out.print(n);
		    else System.out.print(n + " ");
		    if( i % 10 == 0) {
		    	System.out.print('\n');
		    }
		    
		}
		
	}
	
}
//8 9 18 15 14 19 11 17 16 13 12 10 28 25 24 21 27 26 23 22 20  
class CompareNum implements Comparator<Integer>{
	
	@Override
	public int compare(Integer a, Integer b) {
		String a1 = convert(a);
		String a2 = convert(b);
		return a1.compareTo(a2);
	}
	
	public static String convert(int n) {
		String s = Integer.toString(n);
		String ret="";
		for(int i=0; i<s.length(); i++) {
			char t = s.charAt(i);
			switch(t) {
				case '0':
					ret += "zero ";
					break;
				case '1':
					ret += "one ";
					break;
				case '2':
					ret += "two ";
					break;
				case '3':
					ret += "three ";
					break;
				case '4':
					ret += "four ";
					break;
				case '5':
					ret += "five ";
					break;
				case '6':
					ret += "six ";
					break;
				case '7':
					ret += "seven ";
					break;
				case '8':
					ret += "eight ";
					break;
				case '9':
					ret += "nine ";
					break;
			}
		}
		return ret;
	}
}
