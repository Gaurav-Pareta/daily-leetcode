class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        ans.append(strs[0]);
        for (int i = 0; i < strs.length; i++) {

            while (!strs[i].startsWith(ans.toString())) {
                ans.deleteCharAt(ans.length() - 1);
                if (ans.length() == 0) {
                    return "";
                }
            }

        }
        return ans.toString();
    }
}