class Solution {
    public boolean checkString(String s) {
        int i=0;
        boolean befb=true;
        while(i<s.length()){
            if(s.charAt(i)=='a'){
                if(!befb) return false;
            } else{
                if(befb) befb=false;
            }
            i++;
        }
        return true;
    }
}