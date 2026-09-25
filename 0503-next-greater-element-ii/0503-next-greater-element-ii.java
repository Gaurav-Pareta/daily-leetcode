import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[nums.length];
        int count = 1;
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int index = i % nums.length;
            // pop small elements
            while (!s.isEmpty() && nums[index] >= nums[s.peek()]) {
                s.pop();
            }
            // if- else

            if (i < nums.length) {
                if (s.isEmpty()) {
                    nextGreater[index] = -1;
                } else {
                    nextGreater[index] = nums[s.peek()];
                }
            }
            // push
            s.push(index);
        }
        return nextGreater;
    }
}