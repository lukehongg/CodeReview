import java.util.*;
import java.math.BigInteger;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class A028 {
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		System.out.println(A.add(B));
	
	}
}
