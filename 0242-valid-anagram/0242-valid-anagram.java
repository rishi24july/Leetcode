class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
       char a[]=s.toCharArray();
       char b[]=t.toCharArray();
        for(char ele: a){
           if(map.containsKey(ele)){
               int freq=map.get(ele);
               map.put(ele,freq+1);
           }else{
               map.put(ele,1);
           }
       }
       
        for(char ele: b){
           if(map.containsKey(ele)){
               int freq=map.get(ele);
               if(freq<=0) return false;
               map.put(ele,freq-1);
           }else{
               return false;
           }
       }
       return true;
       
    }
}