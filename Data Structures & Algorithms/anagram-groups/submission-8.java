class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          
          List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length ; i++){
            if(strs[i].equals("0")){
                continue;
            }
            List<String> list = new ArrayList<>();
                list.add(strs[i]);
                 for(int j=i+1;j<strs.length ; j++){
                         if(isAnagram(strs[i],strs[j])){
                               list.add(strs[j]);
                               strs[j]="0";
                         }
                }
                result.add(list);
        }
        return result;
    }

    public boolean isAnagram(String str1 , String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }
}
