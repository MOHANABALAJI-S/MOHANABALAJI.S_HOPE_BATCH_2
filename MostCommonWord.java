import java.util.*;
class Solution {
    public int JewelsAndStones(String jewels, String stones) {
        int count = 0;
        Set<Character> s = new HashSet<>();
        for(char c:jewels.toCharArray()){
            s.add(c);
        }
        for(char c:stones.toCharArray()){
            if(s.contains(c))
            count++;
        }
        return count;
    }
}