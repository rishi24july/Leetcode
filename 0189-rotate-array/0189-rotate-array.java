class Solution {
    public void reverse(int[] nums,int left,int right){
         while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int left=0,right=n-1;
       reverse(nums,left,right);
        left=0;
        right=k-1;
        reverse(nums,left,right);
        
        left=k;
        right=n-1;
         reverse(nums,left,right);
       
    }
}