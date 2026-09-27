class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int balance = 0;
        for(int i = 0 ; i < n;i++){
            if(s.charAt(i) == '('){
                if(balance  != 0){
                    ans.append(s.charAt(i));}
                    balance++;
                }
            if(s.charAt(i) == ')'){
                balance--;
                if(balance != 0){
                    ans.append(s.charAt(i));
                }
            }
    }
            return ans.toString();
        }
        
    }
