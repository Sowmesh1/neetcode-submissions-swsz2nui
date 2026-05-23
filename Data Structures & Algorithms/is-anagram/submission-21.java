class Solution {
    public boolean isAnagram(String s, String t) {
         Map<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
              map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
          if(map1.containsKey(t.charAt(i))){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
          }
        else{
          return false;
        }
        }
        for(int values : map1.values()){
          if(values!=0){
            return false;
          }
        }
       return true;
    }
}
