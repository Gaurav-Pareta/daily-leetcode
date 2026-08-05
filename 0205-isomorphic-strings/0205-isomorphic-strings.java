class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hashS = new HashMap<>();
        HashMap<Character,Character> hashT = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(hashS.containsKey(c1)){
                if(hashS.get(c1) != c2) return false;

            }else{
                hashS.put(c1,c2);
            }

            if(hashT.containsKey(c2)){
                if(hashT.get(c2) != c1) return false;
            }else{
                hashT.put(c2,c1);
            }
        }
        return true;
    }
}