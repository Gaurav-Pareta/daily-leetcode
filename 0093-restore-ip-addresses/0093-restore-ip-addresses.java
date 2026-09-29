class Solution {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, 0, "");
        return result;
    }

    private void backtrack(String s, int index, int parts, String ip) {

        // 4 parts created
        if (parts == 4) {
            if (index == s.length()) {
                result.add(ip.substring(0, ip.length() - 1));
            }
            return;
        }

        // Try taking 1, 2, or 3 digits
        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length()) {
                break;
            }

            String part = s.substring(index, index + len);

            // Leading zero
            if (part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            // Greater than 255
            if (Integer.parseInt(part) > 255) {
                break;
            }

            backtrack(
                s,
                index + len,
                parts + 1,
                ip + part + "."
            );
        }
    }
}