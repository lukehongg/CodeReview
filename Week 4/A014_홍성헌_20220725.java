import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                end = nums[i + 1];
            } else {
                if (start != end) {
                  res.add(start + "->" + end);
                } else {
                   res.add(String.valueOf(start));
                }
                start = nums[i + 1];
                end = nums[i + 1];
            }
        }
      
        if (nums[nums.length - 1] > start) {
            res.add(start + "->" + nums[nums.length - 1] );
        } else {
            res.add(String.valueOf(start));
        }
         
        return res;
        
    }
}