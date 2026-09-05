class Solution {
public:
    bool isPalindrome(int x) {
         string num = to_string(x);
         int size=num.size()-1;
         int start=0;
         int end =size;
         while(start<end){
            if (num[start]!=num[end]){
                return false;
            }else{
                start++;
                end--;
            }
         }
         return true;
    }
};