class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int x : cardPoints){
            total += x;
        }

        int windowSize = n-k;

        if(windowSize == 0){
            return total;
        }

        int windowSum = 0;
        // First window
        for(int i = 0; i<windowSize; i++){
            windowSum += cardPoints[i];
        }

        int minWindow = windowSum;
        // Sliding Window
        for(int i = windowSize; i< n; i++){
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i-windowSize];

            minWindow = Math.min(minWindow,windowSum);
        }

        return total - minWindow;
    }
}