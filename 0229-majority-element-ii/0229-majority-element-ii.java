import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > n){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}