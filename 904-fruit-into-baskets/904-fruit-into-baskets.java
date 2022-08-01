class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int i=0;
        int j=0;
        while(j<fruits.length){
            int curr = fruits[j];
            map.put(curr,map.getOrDefault(curr,0)+1);
            while(map.size()>2){
                int c = fruits[i];
                int temp = map.get(c);
                temp--;
                if(temp==0) map.remove(c);
                else map.put(c,temp);
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}