import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char ch1:ransomNote.toCharArray()){
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        for(char ch2:magazine.toCharArray()){
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        for(char key:map1.keySet()){
            if(map2.getOrDefault(key,0)<map1.getOrDefault(key,0))
            return false;
        }
        return true;
        
    }
}