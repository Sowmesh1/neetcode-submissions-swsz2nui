class Solution {
    public boolean isAnagram(String s, String t) {
          int n=s.length();
          int m=t.length();
          int[] str1 = new int[26];
          if(n!=m){
            return false;
          }
          for(int i=0;i<n;i++){
              str1[s.charAt(i)-'a']++;
              str1[t.charAt(i)-'a']--;
          }
          for(int i : str1){
            if(i!=0){
              return false;
            }

          }
          return true;
    }
}
