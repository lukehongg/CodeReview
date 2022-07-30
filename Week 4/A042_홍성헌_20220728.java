import java.util.*;

class Solution {
    
    private String getStackToString(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
              if (!stack.empty() && c == '#') {
                stack.pop();
            } else if (c != '#') {
                stack.push(c);
            } 
        }
        
        return stack.toString();
    }
    
    public boolean backspaceCompare(String S, String T) {
        String s = getStackToString(S);
        String t = getStackToString(T);
        return s.equals(t);
    }
    
}