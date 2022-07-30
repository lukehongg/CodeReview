import java.util.*;
class Solution {
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		 
	   
	    boolean isFirst = true;
	 
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == ' ') {
	            answer.append(s.charAt(i));
	            isFirst = true; 
	        } else {
	            if (isFirst) { 
	                answer.append(String.valueOf(s.charAt(i)).toUpperCase());
	                isFirst = false; 
	            } else {
	                answer.append(String.valueOf(s.charAt(i)).toLowerCase());
	            }
	        }
	    }
	 
	    return answer.toString();
	}
	
}
