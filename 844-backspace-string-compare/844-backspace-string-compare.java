class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(!stk1.isEmpty()){
                    stk1.pop();
                }
            }
            else{
                stk1.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(!stk2.isEmpty()){
                    stk2.pop();
                }
            }
            else{
                stk2.push(t.charAt(i));
            }
        }
        if(stk1.size() != stk2.size()) return false;
        for(int i=stk1.size();i>0;i--){
            Character a = new Character(stk1.pop());
            Character b = new Character(stk2.pop());
            if(!a.equals(b)) return false;
        }
        return true;
    }
}