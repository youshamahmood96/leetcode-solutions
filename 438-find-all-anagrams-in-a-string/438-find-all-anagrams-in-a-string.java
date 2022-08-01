class Solution {
    public  boolean check(int[] a1,int[] a2){
        for(int i=0;i<a1.length;i++){
          if(a1[i]!=a2[i]) return false;
        }
        return true;
      }
    public List<Integer> findAnagrams(String str, String pattern) {
        List<Integer> res = new ArrayList<Integer>();
        int[] pat = new int[26];
        for(int i=0;i<pattern.length();i++){
            pat[pattern.charAt(i)-'a']++;
        }
        int[] ar = new int[26];
        int i=0;
        int j=0;
        while(j<str.length()){
            ar[str.charAt(j)-'a']++;
            if(j-i+1 == pattern.length()){
                if(check(ar,pat)){
                    res.add(i);
                }
                ar[str.charAt(i)-'a']--;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return res;
    }
}