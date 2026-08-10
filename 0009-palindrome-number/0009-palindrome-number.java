class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int revNum = 0;
        
        if(x<0) return false;

        while(x>0){
            int temp = x %10;
            revNum = revNum*10 + temp;
            x = x/10;
        }

        return num == revNum;
    }
}