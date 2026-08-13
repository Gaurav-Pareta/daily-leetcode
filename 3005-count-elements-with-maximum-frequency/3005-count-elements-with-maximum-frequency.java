class Solution {
    public int maxFrequencyElements(int[] nums) {
        if(nums.length == 0) return -1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int highFreq=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>highFreq){
                highFreq = e.getValue();
            }
        }

        int count=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == highFreq){
                count += e.getValue();
            }
        }

        return count;
        
    }
}