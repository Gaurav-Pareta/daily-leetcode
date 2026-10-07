import java.util.*;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tens = 0;
        int fives = 0;
        if(bills[0] != 5){
            return false;
        } 
        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                fives++;
            }
            else if(bills[i] == 10){
                if(fives>=1){
                    tens++;
                    fives--;
                } else{
                    return false;
                }
            }
            else{
                if(tens>=1 && fives>=1){
                   tens--;
                   fives--;
                } else if(fives>=3){
                    fives = fives-3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}