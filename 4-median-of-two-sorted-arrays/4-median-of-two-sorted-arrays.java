class Solution {
    private int[] merge(int a[],int b[]){
        int[] res = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<res.length){
            if(i==a.length){
                while(j<b.length){
                    res[k] = b[j];
                    j++;
                    k++;
                }
                break;
            }
            else if(j==b.length){
                while(i<a.length){
                    res[k] = a[i];
                    i++;
                    k++;
                }
                break;
            }
            if(a[i]<=b[j]){
                res[k] = a[i];
                i++;
            }
            else if(a[i]>b[j]){
                res[k] = b[j];
                j++;
            }
            k++;
        }
        return res;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1,nums2); 
        int length = arr.length;
        double result = 0;
        if(length%2 == 0){
            int index = (length-1)/2;
            int index1 = index + 1;
            result = (double)(arr[index] + arr[index1])/2;
        }
        else{
            int index = length/2;
            result = arr[index];
        }
        return result;
    }
}