import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class A035 {
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int op_num = st.countTokens();
			float localSum = Float.parseFloat(st.nextToken()); 
			for(int j=1; j<op_num; j++) {
				String temp = st.nextToken();
				if(temp.contains("@")) {
					localSum *= 3;
				}
				else if(temp.contains("%")) {
					localSum += 5;
				}
				else if(temp.contains("#")) {
					localSum -= 7;
				}
				
			}
			System.out.println(String.format("%.2f", localSum));
		}
	}
}
