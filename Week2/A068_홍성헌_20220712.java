package W2;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class A068_홍성헌_20220712 {
	public static void run(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(st.nextToken());
		int[] queue = new int[N];
		
		int front=0;
		int back=0;
		String cmd;
		
		while(N>0) {
			st = new StringTokenizer(br.readLine(), " ");
			cmd = st.nextToken();
			String temp;
			   switch(cmd){
			        case "push":
							  queue[back] = Integer.parseInt(st.nextToken()); 
                back++;
			          break;
			          
			        case "pop":
			  				if(front==back) bw.write("-1\n");
			  				else {
			            temp = queue[front] + "\n";
                  front++;
			            bw.write(temp);
			          }
			          break;
			          
			        case "size":
			          temp = (back-front) + "\n";
			          bw.write(temp);
			          break;
						
			        case "empty":
			  				if(front==back) bw.write("1\n");
			  				else bw.write("0\n");
			          break;
			  			
			        case "front":
			  				if(front==back) bw.write("-1\n");
			  				else {
                  temp = queue[front] + "\n";
                  bw.write(temp);
                }
			          break;
			  			
			        case "back":
			  				if(front==back) bw.write("-1\n");
			  				else {
			             temp = queue[back-1] + "\n";
			              bw.write(temp);
			          }
			          break;
			      }
			N--;
		}
      bw.flush();
	}
}
