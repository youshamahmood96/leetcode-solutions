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
}