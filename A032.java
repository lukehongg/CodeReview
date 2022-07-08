import java.util.Scanner;
public class A032 {
	public static void run(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int testcase=0; testcase<N; testcase++) {
			int k = input.nextInt();
			int n = input.nextInt();
			int[][] apartment = new int[k+1][n+1];
			for(int i=1; i<=n; i++) {
				apartment[0][i] = i;
			}
			for(int i=0; i<=k; i++) {
				if(i==0) apartment[0][i]=i;
				else{
					for(int j=1; j<=n; j++) {
						apartment[i][j] = apartment[i][j-1]+apartment[i-1][j];
					}
				}
			}
			System.out.println(apartment[k][n]);
		}

	}
}