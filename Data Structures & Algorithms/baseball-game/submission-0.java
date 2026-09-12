class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){
            if(isInteger(s)){
                stack.push(Integer.parseInt(s));
            }
            if(s.equals("+")){
                 System.out.println("chay vao lenh + ");
                int so1 = stack.peek();  // so 2 
                stack.pop();
                int so2 = stack.peek();   // so 1
                stack.pop();
                int tong = so1+so2;
                stack.push(so2);
                stack.push(so1);
                stack.push(tong);
            }
            if(s.equals("C")){
               stack.pop();
            }
             if(s.equals("D")){
               stack.push(2*stack.peek());
            }
        }
       
        int res =0;
        while (!stack.isEmpty()) {
        res = res + stack.pop(); 
}
        return res;
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}