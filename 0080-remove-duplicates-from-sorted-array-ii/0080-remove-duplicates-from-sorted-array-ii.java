class Solution {
    public int removeDuplicates(int[] nums) {
        int a=nums.length;
        int k=0;
        for(int i=0;i<a;i++)
        {
            if(k<2 || nums[i] !=nums[k-2])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}