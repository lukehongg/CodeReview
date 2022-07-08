
import java.util.Scanner;
public class A030 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int today = input.nextInt();
		
		float[] percent = new float[2];
		
		for(int i=0; i<4; i++) {
			percent[i] = input.nextFloat();
			
		}
		float[][] happy = new float[2][N+1];
		float[][] sad = new float[2][N+1];
		
		// happy -> happy
		happy[0][0] = 1;
		// sad -> happy
		happy[1][0] = 1;
		
		// happy -> sad
		sad[0][0] = 1;
		// sad -> sad
		sad[1][0] = 1;
		
		
		
		
		
		for(int i=1; i<=N; i++) {
			
		}
		
		
	}

}
