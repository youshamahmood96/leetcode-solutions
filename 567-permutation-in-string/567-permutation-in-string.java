class Solution {
    private boolean match(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=0;
        while(j<s2.length()){
            s2Arr[s2.charAt(j)-'a']++;
            int len = j-i+1;
            if(len==s1.length()){
                if(match(s1Arr,s2Arr)){
                    return true;
                }
                else{ 
                    s2Arr[s2.charAt(i++)-'a']--;
                }
            }
            j++;
        }
        return match(s1Arr,s2Arr);
    }
}