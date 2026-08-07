class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')', '(');
        pair.put(']', '[');
        pair.put('}','{');
        Stack<Character> stack = new Stack<>();
        if(s.length()<=1) return false;
        for(Character x : s.toCharArray()){
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
            }
            else  {
                if(stack.isEmpty()) return false;
                if(pair.get(x)!=stack.peek()) return false;
                else 
                stack.pop();
                
            }
        }
        return stack.isEmpty()?true:false;
    }
}
