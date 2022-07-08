import java.util.ArrayList;
import java.util.List;
public class A02 {
	public static List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> ret = new ArrayList<>();
		int i, j;
		for(i=0; i<numRows; i++) {
			List <Integer> temp = new ArrayList<>();
			for(j=0; j<=i; j++) {
				if(j==0 || j==i) {
					temp.add(1);
				}
				else {
					int a=ret.get(i-1).get(j-1);
					int b=ret.get(i-1).get(j);
					temp.add(a+b);
				}
			}
			ret.add(temp);
		}
		
		return ret;
    }
}
