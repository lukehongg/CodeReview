class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        int p=0, y=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'p' || ch[i] == 'P') p++;
            else if (ch[i] == 'y' || ch[i] == 'Y') y++;
        }
        if(p != y) answer = false;

        return answer;
    }
}