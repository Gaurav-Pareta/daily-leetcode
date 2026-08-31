class Solution {
    public String convert(String s, int numRows) {

        // Edge cases
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create StringBuilder for every row
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Add characters to rows
        for (char ch : s.toCharArray()) {

            rows[currentRow].append(ch);

            // Change direction at top or bottom
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}