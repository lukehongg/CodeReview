import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String s: skill_trees){
            String temp = s;
            for(int i=0; i<s.length(); i++){
                String temp2 = String.valueOf(s.charAt(i));
                if(!skill.contains(temp2)){
                    temp = temp.replace(temp2,"");
                }
            }
            if(skill.indexOf(temp) == 0) answer++;
        }
        return answer;
    }
}