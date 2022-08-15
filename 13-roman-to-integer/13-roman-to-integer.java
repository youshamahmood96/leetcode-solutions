class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<String, Integer> map  = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            char curr = s.charAt(i);
            String temp = "" + curr;
            switch(curr) {
              case 'I':
                if(i+1<s.length() && ((s.charAt(i+1)=='V') || (s.charAt(i+1)=='X'))){
                    temp+=s.charAt(i+1);
                    i++;
                }
                break;
              case 'X':
                if(i+1<s.length() && ((s.charAt(i+1)=='L') || (s.charAt(i+1)=='C'))){
                    temp+=s.charAt(i+1);
                    i++;
                }
                break;
              case 'C':
                if(i+1<s.length() && ((s.charAt(i+1)=='D') || (s.charAt(i+1)=='M'))){
                    temp+=s.charAt(i+1);
                    i++;
                }
                break;
              default:
                break;
            }
            list.add(temp);
            i++;
        }
        for(String curr:list){
            res+=map.get(curr);
        }
        return res;
    }
}