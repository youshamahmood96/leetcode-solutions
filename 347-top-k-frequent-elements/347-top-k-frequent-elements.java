class Solution {
    Map<Integer,Integer> count;
    int[] arr;
    int m;
    private void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void quickselect(int l,int r){
        if(l>=r) return;
        int pivot = arr[r];
        int p = l;
        for(int i=l;i<=r;i++){
            if(count.get(arr[i])<count.get(pivot)){
                swap(p,i);
                p+=1;
            }
        }
        swap(p,r);
        if(p<m){
            quickselect(p+1,r);
        }
        else if(p>m){
            quickselect(l,p-1);
        }
        else{
            return;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        count = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        m = count.size() - k;
        arr = new int[count.size()];
        int i=0;
        for(int j:count.keySet()){
            arr[i] = j;
            i++;
        }
        quickselect(0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        return Arrays.copyOfRange(arr,arr.length-k,arr.length);
    }
}