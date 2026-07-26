class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int pro=-1;
                int size=nums.length;
       if(nums[0]<0&&nums[1]<0){
         pro=nums[0]*nums[1];
        pro=pro*nums[size-1];
       }


        int a=nums[size-1];
        int b=nums[size-2];
        int c=nums[size-3];
        int product=a*b;
        product=product*c;
        product=Math.max(product,pro);
        return product;
       
       
    }
}