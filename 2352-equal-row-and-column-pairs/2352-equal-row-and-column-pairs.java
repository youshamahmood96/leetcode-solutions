class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<grid.length;i++){
            String key = Arrays.toString(grid[i]);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i=0;i<grid.length;i++){
            int[] temp = new int[grid.length];
            for(int j=0;j<grid[i].length;j++){
                temp[j] = grid[j][i];
            }
            String key = Arrays.toString(temp);
            if(map.containsKey(key)){
                res += map.get(key);
            }
        }
        return res;
    }
}