import java.util.*;
public class A049 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		boolean[] conditions = new boolean[3];
		while(!s.equals("end")) {
			conditions[0] = false;
			conditions[1] = true;
			conditions[2] = true;
			
			// first condition
			boolean[] second = new boolean[s.length()];
			for(int i=0; i<s.length(); i++) {
				second[i] = vowel(s.charAt(i));
				if(second[i]) {
					conditions[0] = true;
				}
				if(i>1) {
					if(second[i] == second[i-1] && second[i] == second[i-2]) {
						conditions[1] = false;
					}
				}
				if(i > 0) {
					if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) != 'e' && s.charAt(i) != 'o') {
						conditions[2] = false;
					}
				}
				
			}
			if(conditions[0] &&  conditions[1] && conditions[2]) {
				System.out.println("<" + s + ">" + " is acceptable.");
			} else {
				System.out.println("<" + s + ">" + " is not acceptable.");
			}	
			s= input.next();
		}
		
	}
	private static boolean vowel (char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
		else return false;
	}
	
}
