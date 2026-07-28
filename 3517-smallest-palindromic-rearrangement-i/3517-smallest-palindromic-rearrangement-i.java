class Solution {
    public String smallestPalindrome(String s) {
         int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) middle = (char)(i + 'a');
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char)(i + 'a'));
            }
        }

        String right = left.reverse().toString();
        left.reverse(); // restore original left
        if (middle == 0) {
    return left.toString() + right;
} else {
    return left.append(middle).append(right).toString();
}

    }
}