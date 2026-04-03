class Solution {
    public boolean isPalindrome(String s) {
       String  str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      int n=str.length();
    for (int i=0 , j=n-1 ; i<j ;i++,j--){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
    }
    return true;
}
}