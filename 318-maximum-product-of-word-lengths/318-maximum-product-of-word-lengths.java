class Solution {
    private boolean isUniq(String a,String b){
        int[] alph = new int[26];
        for(int i=0;i<a.length();i++){
            alph[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            if(alph[b.charAt(i)-'a']>0) return false;
        }
        return true;
    }
    public int maxProduct(String[] words) {
        int res = 0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(isUniq(words[i],words[j])){
                    res = Math.max(words[i].length() * words[j].length(),res);
                }
            }
        }
        return res;
    }
}