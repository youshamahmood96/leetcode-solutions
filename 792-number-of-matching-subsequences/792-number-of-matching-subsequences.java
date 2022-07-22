class Solution {
    public boolean isSubsequence(String s, String t) {
        char ch[] = s.toCharArray();
        int j = 0;
        for(int i=0;i<t.length();i++){
            if(j>=s.length()) break;
            if(t.charAt(i)==ch[j]){
                j++;
            }
        }
        return j==s.length();
    }
    public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int res = 0;
        for(String m:words){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(String m:map.keySet()){
            if(isSubsequence(m,s)) {
                res += map.get(m);
            }
        }
        return res;
    }
}