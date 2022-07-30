import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        char num, stNum;
        for(int i=0;i<number.length();i++){
            num=number.charAt(i);
            while(!st.isEmpty()&&k>0){
                stNum=st.peek();
                if(stNum<num){
                    st.pop();
                    k--;
                }
                else{
                    break;
                }
            }
            st.push(num);
        }
        while(!st.isEmpty()&&k>0){
            st.pop();
            k--;
        }
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        answer=sb.toString();
        return answer;
    }
}