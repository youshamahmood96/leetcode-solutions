class Solution {
    int[] arr;
    int m;
    private void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private int quick(int l,int r){
        int pivot = arr[r];
        int p = l;
        for(int i=l;i<=r;i++){
            if(arr[i]<pivot){
                swap(p,i);
                p++;
            }
        }
        swap(p,r);
        if(p<m){
            return quick(p+1,r);
        }
        else if(p>m){
            return quick(l,p-1);
        }
        else{
            return arr[p];
        }
    }
    public int findKthLargest(int[] nums, int k) {
        arr = Arrays.copyOf(nums,nums.length);
        m = nums.length - k;
        return quick(0,nums.length-1);
    }
}