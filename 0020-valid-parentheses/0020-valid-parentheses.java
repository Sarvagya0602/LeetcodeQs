class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(': 
                    st.push('(');
                    break;
                case '{': 
                    st.push('{');
                    break;
                case '[': 
                    st.push('[');
                    break;
                case ')':
                    if(st.isEmpty() || st.peek()!='(') return false; 
                    st.pop();
                    break;
                case '}': 
                    if(st.isEmpty() || st.peek()!='{') return false; 
                    st.pop();
                    break;
                case ']': 
                    if(st.isEmpty() || st.peek()!='[') return false; 
                    st.pop();
                    break;
                default:
                    return false;
            }
        }
        return st.isEmpty();
    }
}