class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1; i<=s.length()/2;i++){
            // System.out.println(check(s,i));
            answer = Math.min(answer, check(s,i).length());
        }
        return answer;
    }
    public String check(String s, int unit) {
        String result="";
        String prev="";
        int count = 1;
        
        for(int i=0; i<=s.length() + unit; i = i+unit){
            String curr;
            
            if(i>=s.length()){
                curr="";
            } else if(i+unit > s.length()){
                curr=s.substring(i);
            } else curr = s.substring(i, i+unit);
            
            if(i != 0){
                if(prev.equals(curr)){
                    count++;
                } else if(count>1){    
                    result += count;
                    result += prev;
                    count = 1;
                } else {
                    result += prev;
                }    
            }
            prev = curr;
        }
        return result;
    }
}