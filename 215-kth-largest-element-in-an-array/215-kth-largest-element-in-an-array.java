class Solution {
    int k;
    int[] unique;
    private void swap(int i,int j){
        int temp = unique[i];
        unique[i] = unique[j];
        unique[j] = temp;
    }
    private int quickselect(int l,int r){
        int pivot = unique[r];
        int p = l;
        for(int i=l;i<=r;i++){
            if(unique[i]<pivot){
                swap(i,p);
                p+=1;
            }
        }
        swap(p,r);
        if(p>k){
            return quickselect(l,p-1);
        }
        else if(p<k){
            return quickselect(p+1,r);
        }
        else{
           return unique[p]; 
        }
    }
    public int findKthLargest(int[] nums, int l) {
        unique = Arrays.copyOf(nums,nums.length);
        k = nums.length - l;
        return quickselect(0,nums.length-1);
    }
}