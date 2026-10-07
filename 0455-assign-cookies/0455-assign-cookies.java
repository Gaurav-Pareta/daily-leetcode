import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int greed = 0;
        int cookies = 0;
        int count = 0;

        while(greed<g.length && cookies<s.length){
            if(g[greed]<= s[cookies]){
                count++;
                greed++;
                cookies++;
            } else{
                cookies++;
            }
        }
        return count;
    }
}