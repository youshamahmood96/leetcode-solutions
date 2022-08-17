class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String curr = words[i];
            String res = "";
            for(int j=0;j<curr.length();j++){
                res+=morse[curr.charAt(j)-'a'];
            }
            set.add(res);
        }
        return set.size();
    }
}