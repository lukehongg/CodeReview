import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Vector<Integer> v = new Vector<Integer>();
        int count = 0;
        for(int n: arr){
            if(n % divisor == 0){
                v.add(n);
                count++;
            }
        }
        if(count == 0){
            v.add(-1);
        } else {
            v.sort(Comparator.naturalOrder());
        }
        int[] answer = new int[v.size()];
        for(int i=0; i<v.size(); i++){
		    answer[i] = v.elementAt(i);
        }
        String s  = "123";
        if(s.contains(String.valueOf(s.charAt(1)))) {
        	
        }
        char c = 'c';
        String.valueOf(c);
        return answer;
        
    }
}