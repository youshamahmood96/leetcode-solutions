class Solution {
    private String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String curr = sortString(strs[i]);
            ArrayList<String> strArr;
            if(map.containsKey(curr)){
                strArr = map.get(curr);
                strArr.add(strs[i]);
            }
            else{
                strArr = new ArrayList<>();
                strArr.add(strs[i]);
            }
            map.put(curr,strArr);
        }
        for(String s:map.keySet()){
            ArrayList<String> strArr = map.get(s);
            res.add(strArr);
        }
        return res;
    }
}