class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k %=l;
        int[] rot = new int[l];
        for(int i=0;i<l;i++){
            if(i<k){
                rot[i]=nums[l+i-k];
            }
            else{
                rot[i]=nums[i-k];
            }
        }
        for(int i=0;i<l;i++)
        {
            nums[i]=rot[i];
        }
    }
}


