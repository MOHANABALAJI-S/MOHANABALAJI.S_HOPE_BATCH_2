class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        if(isbulky(length,width,height)&& mass>=100)
        return "Both";
        else if(!(isbulky(length,width,height))&& mass<100)
        return "Neither";
        else if(!(isbulky(length,width,height))&& mass>=100)
        return "Heavy";
        else 
        return "Bulky";
    }

       public boolean isbulky(int length,int width,int height){
       long volume = (long)length * (long)width * (long)height;
       if(length>=10000||width>=10000||height>=10000){
       return true;
       }
       if(volume>=1000000000){
       return true;
             }
                   return false;
    }
}