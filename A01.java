import java.util.Arrays;
public class A01 {
	public static int run(int[] g, int[] s) {
		
		Arrays.sort(g);
		Arrays.sort(s);
		
        int count=0;
        int child_idx=0;
        int coockie_idx=0;
        
        while(child_idx < g.length && coockie_idx < s.length){
            if(g[child_idx] <= s[coockie_idx]){
                child_idx++;
                coockie_idx++;
                count++;
            }
            else {
                coockie_idx++;
            }
        }
        
        return count;
	}
}
