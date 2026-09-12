class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){ 
            if(s.equals("+")){
                int so1 = stack.peek();  // so 2 
                stack.pop();
                int so2 = stack.peek();   // so 1
                stack.pop();
                int tong = so1+so2;
                stack.push(so2);
                stack.push(so1);
                stack.push(tong);
            }
             else if(s.equals("C")){
               stack.pop();
            }
              else if(s.equals("D")){
               stack.push(2*stack.peek());
            }
            else{
                stack.push(Integer.parseInt(s));
            
            }
        }
       
        int res =0;
        while (!stack.isEmpty()) {
        res = res + stack.pop(); 
}
        return res;
    

   
    }
}