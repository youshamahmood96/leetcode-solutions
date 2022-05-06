class Solution {
    private int maxValue(Map<Character,Integer> map){
        int temp = Integer.MIN_VALUE;
        for(Character c:map.keySet()){
            if(map.get(c)>temp){
                temp = map.get(c);
            }
        }
        return temp;
    }
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int i=0;
        int j = 0;
        int res = 0;
        int curr = 0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            int windowLen = j-i+1;
            int condition = windowLen - maxValue(map);
            if(condition<=k){
               res = Math.max(windowLen,res);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            j++;
        }
        return res;
    }
}