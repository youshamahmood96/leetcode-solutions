class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(map.get(curr)==1) return i;
        }
        return -1;
    }
}