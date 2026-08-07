class Solution {
    public double[] convertTemperature(double c) {
        double [] ans =new double[2];
        double k=273.15+c;;
        double f= (c*1.8)+32;
        ans[0]= k;
        ans[1]= f;
      return ans;
    }
}