import java.util.Scanner;

public class A008 {
	public static void run() {
		Scanner input = new Scanner(System.in);
		//A008
		int N = input.nextInt();
		
		for(int i = 0; i<N; i++) {
			int localN = input.nextInt();
			int count = 0;
			float sum = 0.000f;
			float avg = 0.000f;
			float[] temp = new float[localN];
			
			for(int j=0; j<localN; j++) {
				temp[j] = (float)input.nextInt();
				sum = sum + temp[j];
			}
			
			avg = sum / localN;
			
			for(int j=0; j<localN; j++) {
				if(temp[j] > avg) count++;
			}
			
			System.out.println(String.format("%.3f", 100.000 * count/localN) + "%");
			
		}	
	}

}
