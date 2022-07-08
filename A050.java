import java.util.*;
public class A050 {
	public static void run(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String t = input.next();
		for(int i=0; i<t.length(); i++) {
			int alp = t.charAt(i) - 3;
			if(alp < 65) alp += 26; 
			System.out.print((char)alp);
		}
	}
}
