// public class Kpat{
//     static String Zigzag(String s,int n){
//         int l=s.length();
//         boolean f=true;
//         int x=2,x2=(n*2)-2;
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<n-1;i++){
//             sb.append(s.charAt(i));
//             for(int j=i;j<l;j++){
//                 if(j<l){
//                     if(f){
//                         sb.append(s.charAt((n*2)-x));
//                         j+=(l*2)-x;
//                         f=false;
//                     }
//                     else{
//                         sb.append(s.charAt((n*2)-x2));
//                         j+=(l*2)-x2;
//                         f=true;
//                     }
//                     x*=2;
//                     x2/=2;
//                     j-=1;
//                 }    
//             }
//         }
//         return new String(sb);
//     }
//     public static void main(String[] args){
//         System.out.println(Zigzag("paypalishiringir",3));
//     }
// }
public class ZigzagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] =new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < s.length(); i++) {
            rows[currentRow].append(s.charAt(i));

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            if (goingDown) currentRow++;
            else currentRow--;
        }

        StringBuilder result =new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String output = convert("paypalishirinh", 3);
        System.out.println(output);
    }
}