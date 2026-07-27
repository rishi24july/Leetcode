class Solution {
    public int maxProduct(int[] nums) {
        int size=nums.length;
        Arrays.sort(nums);
       int max=nums[size-1];
       int max2=nums[size-2];
        
        int pro=(max-1)*(max2-1);
        return pro;
    }
}