class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String sum = Integer.toString(a+b);
                stack.push(sum);
            }
            else if(tokens[i].equals("-")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String sum = Integer.toString(b-a);
                stack.push(sum);
            }
            else if(tokens[i].equals("*")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String sum = Integer.toString(a*b);
                stack.push(sum);
            }
            else if(tokens[i].equals("/")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String sum = Integer.toString(b/a);
                stack.push(sum);
            }
            else{
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}