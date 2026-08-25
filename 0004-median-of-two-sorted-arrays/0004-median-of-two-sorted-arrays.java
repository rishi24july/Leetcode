class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int[] ans = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(arr1[i] < arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }
        while(i<m) ans[k++] = arr1[i++];
        while(j<n) ans[k++] = arr2[j++];

        int s = m+n;
        if(s % 2 != 0){
            return ans[s/2]; // odd length
        } else {
            return (ans[s/2 - 1] + ans[s/2]) / 2.0; // even length
        }
    }
}
