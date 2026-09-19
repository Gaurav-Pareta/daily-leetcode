import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = nums2.length -1; i>=0; i--){
            // pop small elements
            while(!s.isEmpty() && nums2[i] > nums2[s.peek()] ){
                s.pop();
            }
            // if- else
            if(s.isEmpty()){
                map.put(nums2[i],-1);
            } else{
                map.put(nums2[i],nums2[s.peek()]);
            }
            // push
            s.push(i);
        }

        for(int i = 0; i<nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
        
    }
}