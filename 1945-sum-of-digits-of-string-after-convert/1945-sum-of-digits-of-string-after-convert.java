class Solution {
    private int recursionHelper(String res,int k){
        if(k==0) return Integer.parseInt(res);
        int sum = 0;
        for(int i=0;i<res.length();i++){
            sum = sum + Character.getNumericValue(res.charAt(i));
        }
        return recursionHelper(Integer.toString(sum),k-1);
    }
    public int getLucky(String s, int k) {
        String res = new String();
        for(int i=0;i<s.length();i++){
            int temp = (int)s.charAt(i) - 'a' + 1;
            res+= Integer.toString(temp);
        }
        return recursionHelper(res,k);
    }
}