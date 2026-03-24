class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1')ones++;
            
        }
        return "1".repeat(ones-1)+"0".repeat(s.length()-ones)+"1";
    }
}
