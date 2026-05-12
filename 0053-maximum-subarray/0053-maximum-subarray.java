class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum=Integer.MIN_VALUE;
        int current=0;
        for(int a:nums){
            current=current+a;

            if(current > Maxsum){
                Maxsum= current;
            }
            if(current<0){
                current=0;
            }       
        }
         return Maxsum;
    }
   
    
}