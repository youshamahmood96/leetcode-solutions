class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j = 0;
        Set<Character> set = new HashSet<Character>();
        int res = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
            res = Math.max(res,set.size());
        }
        return res;
    }
}