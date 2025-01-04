import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> numOfPo = new ArrayList<>();

        for(int i=0; i< nums.length; i++) {
            if(!numOfPo.contains(nums[i])) {
                numOfPo.add(nums[i]);
            }
        }
        
        
        int answer = 0;
        
         if(nums.length/2 > numOfPo.size()) {
            answer = numOfPo.size();
        } else {
            answer = nums.length/2;
        }
        return answer;
    }
}