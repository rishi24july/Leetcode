import java.util.*;
class Solution {
    Stack <Character> st=new Stack<>(); 
    public boolean isValid(String s) {
 
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
            return false;
        }
        int size=s.length();
        if(size%2!=0){
            return false;
        }
        
        int i=0;
        while(i<size){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
             if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(st.size()==0) return false;
                char temp=s.charAt(i);
                char t2;
                if(st.size()!=0)  t2=st.peek();
               else t2='5';
               boolean match= equal(t2,temp);
               if(!match) return false;
             }
            i++;
        }
        if(st.size()==0) return true;
        return false;
    }
     public boolean equal(char a,char b){
        if((a=='('&&b==')')||(a=='['&&b==']')||(a=='{'&&b=='}')){
            st.pop();
            return true;
        }else {
            return false;
        }
     }
}