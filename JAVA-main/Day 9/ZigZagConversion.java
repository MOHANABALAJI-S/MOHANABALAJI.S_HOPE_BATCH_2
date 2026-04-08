public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)
            return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        boolean goingup=true;
        int curr=0;
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            if(curr==0 || curr==numRows-1){
                goingup=!goingup;
            }
            curr+=goingup?-1:1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row:rows){
            res.append(row);
        }
        return res.toString();
    }
}
