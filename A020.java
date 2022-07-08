import java.util.*;
public class A020 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] pass = new int[4][2];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				pass[i][j] = input.nextInt();
			}
		}
		int currentPassenger=0;
		int max=0;
		int station = 0;
		
		while(station < 4) {
			currentPassenger += (pass[station][1] - pass[station][0]);
			if(max < currentPassenger) {
				max = currentPassenger;
			}
			station++;
		}
		System.out.println(max);
		
	}
}
