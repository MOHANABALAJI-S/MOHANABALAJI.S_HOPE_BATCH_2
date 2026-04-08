public class WaveformPattern
{
	public static void main(String[] args) {
		String str ="VIRATKOHLI";
		int n = str.length();
		StringBuilder even= new StringBuilder();
		StringBuilder odd=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.append(str.charAt(i));
            }
            else{
                odd.append(str.charAt(i));
                }
        }
        System.out.println(even.append(odd));
	    
}
}