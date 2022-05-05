class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<ArrayList<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
                for(int j=nums.length-1;j-i>=3;j--){
                    int newTarget = target - (nums[i]+nums[j]); 
                    int low = i+1;
                    int high = j-1;
                    if(i==0 || j==nums.length-1 || (i>0 && nums[i]!=nums[i-1]) || (j<nums.length-1 && nums[j]!=nums[j+1])){
                        while(low<high){
                            if(nums[low]+nums[high]<newTarget){
                                low++;
                            }
                            else if(nums[low]+nums[high]>newTarget){
                                high--;
                            }
                            else{
                                ArrayList<Integer> num = new ArrayList<Integer>();
                                num.add(nums[i]);
                                num.add(nums[j]);
                                num.add(nums[low]);
                                num.add(nums[high]);
                                res.add(num);
                                while(low<high && nums[low]==nums[low+1]){
                                    low++;
                                }
                                while(low<high && nums[high]==nums[high-1]){
                                    high--;
                                }
                                low++;
                                high--;
                            }
                        }
            }
        }
    }
                List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(res);

         return ans;
}
}