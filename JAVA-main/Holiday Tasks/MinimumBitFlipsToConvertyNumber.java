class Solution {
    public int minBitFlips(int start, int goal) 
    {
        int iResult = 0;
        int iCount = 0;

        iResult = start ^ goal;

        while(iResult != 0)
        {
            if(iResult % 2 == 1)
            {
                iCount++;
            }
            iResult = iResult / 2;
        }
        return iCount;
    }
}