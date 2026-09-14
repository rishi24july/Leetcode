class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
       for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!st1.isEmpty()) st1.pop();
            } else {
                st1.push(t.charAt(i));
            }
        }
        if(st.size()!=st1.size()) return false;
        while (!st.isEmpty()) {
            if (st.pop() != st1.pop()) return false;
        }
        return true;
    }
}