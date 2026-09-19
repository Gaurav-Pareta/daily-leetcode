class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }

            // Closing bracket
            else{

                // No opening bracket available
                if (s.isEmpty()) {
                    return false;
                }

                if (ch == ')' && s.peek() == '(') {
                    s.pop();
                } else if (ch == '}' && s.peek() == '{') {
                    s.pop();
                } else if (ch == ']' && s.peek() == '[') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
}