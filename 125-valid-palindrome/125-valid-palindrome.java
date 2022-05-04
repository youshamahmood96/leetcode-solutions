class Solution {
    private String removeNonAlphanumeric(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]","");
        return str.toLowerCase();
    }
    public boolean isPalindrome(String s) {
        s = removeNonAlphanumeric(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}