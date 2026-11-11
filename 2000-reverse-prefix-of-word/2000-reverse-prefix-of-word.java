class Solution {
    public String reversePrefix(String word, char ch) {
        String result="";
        Stack<Character> s=new Stack<>();
        int i=0;
        boolean exists=false;
        while (i < word.length()) {
            s.push(word.charAt(i));
            if (word.charAt(i) == ch) {
                i++;
                exists=true;
                break;
            }
            i++;
        }
        if(!exists) return word;

        while(!s.isEmpty()){
              result += s.pop();
        }
        while(i<word.length()){
            result+=word.charAt(i++);
        }

        return result;
    }
}