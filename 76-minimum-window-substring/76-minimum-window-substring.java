class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int matched = 0;
        String res = "";
        for(char c:t.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        for(int j=0;j<s.length();j++){
            char curr = s.charAt(j);
            if(map.containsKey(curr)){
                map.put(curr,map.get(curr)-1);
                if(map.get(curr)>=0) matched++;
            }
            while(matched == t.length()){
                if(res.length()>j-i+1 || res.length() == 0){
                    res = s.substring(i,j+1);
                }
                char leftCurr = s.charAt(i++);
                if(map.containsKey(leftCurr)){
                    if(map.get(leftCurr)==0) matched--;
                    map.put(leftCurr, map.get(leftCurr) + 1);
                }
            }
        }
        return res;
    }
}