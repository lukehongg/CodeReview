import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> numList = new ArrayList<>();
        for ( int i = 0 ; i < nums.length; i++){
            int targetNum = nums[i];
            int index = numList.indexOf(targetNum);
            if(index >=0){
                numList.remove(index);
            }else{
                  numList.add(targetNum);
            }

        }
      
          return numList.get(0);
    }
}