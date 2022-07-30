class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int bracketCount = 0;
        int bracketStartIdx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bracketCount++;
            } else if (s.charAt(i) == ')') {
                bracketCount--;
            }
            
            if (bracketCount == 0) {
                sb.append(s.substring(bracketStartIdx + 1, i));
                bracketStartIdx = i + 1;
            }
        }
        
        return sb.toString();
    }
}
