class Solution {
    public boolean checkDivisibility(int n) {
                int sum = 0;
        int product = 1;
        int number=n;
        // Special case: if number is 0, sum=0, product=0
        if (number == 0) {
            sum = 0;
            product = 0;
        } else {
            while (number > 0) {
                int digit = number % 10; // Extract last digit
                sum += digit;            // Add to sum
                product *= digit;        // Multiply to product
                number /= 10;            // Remove last digit
            }
        }
        int ans=sum+product;
        if(n%ans==0) return true;
        else return false;
    }
}