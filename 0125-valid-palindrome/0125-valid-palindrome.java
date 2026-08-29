class Solution {
    public boolean isPalindrome(String s) {
        String palin="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))
                palin+=Character.toLowerCase(s.charAt(i));
            else if (Character.isDigit(s.charAt(i)))
                palin+=s.charAt(i);
        }
        int j=0,k=palin.length()-1;
        if(k<=0) return true;
        while(j<k){
            if(!(palin.charAt(j++)==palin.charAt(k--))) return false;
        }
        return true;
    }
}