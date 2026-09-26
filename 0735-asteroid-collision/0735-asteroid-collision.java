import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                s.push(asteroids[i]);
            } else {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])) {
                    s.pop();
                }

                if (!s.isEmpty() && s.peek() == Math.abs(asteroids[i])) {
                    s.pop();
                } else if (s.isEmpty() || s.peek() < 0) {
                    s.push(asteroids[i]);
                }
            }

        }
        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }

        return res;
    }
}