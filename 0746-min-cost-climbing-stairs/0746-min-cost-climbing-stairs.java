class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min (climb(0,cost),climb(1,cost));
    }
    public int climb(int i,int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]= cost[i]+ Math.min (climb(i+1,cost),climb(i+2,cost));
    }
}