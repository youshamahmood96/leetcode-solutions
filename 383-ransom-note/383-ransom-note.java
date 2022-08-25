class Solution {
    public boolean canConstruct(String rn, String mz) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<mz.length();i++){
            char curr = mz.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        for(int i=0;i<rn.length();i++){
            char curr = rn.charAt(i);
            if(!map.containsKey(curr)) return false;
            int temp = map.get(curr);
            temp--;
            if(temp==0) map.remove(curr);
            else map.put(curr,temp);
        }
        return true;
    }
}