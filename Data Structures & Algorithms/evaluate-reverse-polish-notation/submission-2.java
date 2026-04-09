class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        
        for(String s : tokens){
            int result =1;
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                int temp = Integer.parseInt(s);
                stack.push(temp);
            }
            else{
                
                 int b = stack.pop();
                 int a = stack.pop();
                if(s.equals("+")){
                    result = a+b;
                }
                else if (s.equals("-")){
                     result = a-b;
                }
                else if(s.equals("*")){
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
