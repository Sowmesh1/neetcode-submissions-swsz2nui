class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Deque<Integer> stack = new ArrayDeque<>();
        String operator;
        int result =1;
        int a=1;
        int b =1;
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                int temp = Integer.parseInt(s);
                stack.push(temp);
            }
            else{
                operator = s;
                 b = stack.pop();
                 a = stack.pop();
                if(operator.equals("+")){
                    result = a+b;
                }
                else if (operator.equals("-")){
                     result = a-b;
                }
                else if(operator.equals("*")){
                    result= a*b;

                }
                else{
                     result = a/b;
                }
                stack.push(result);
            }
           }

       return stack.pop(); 
    }
}
