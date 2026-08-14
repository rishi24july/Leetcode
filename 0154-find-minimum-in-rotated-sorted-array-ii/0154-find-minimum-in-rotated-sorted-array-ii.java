class Solution {
    public int findMin(int[] nums) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for (int ele:nums){
        pq.add(ele);
      }
      return pq.peek();
    }
}