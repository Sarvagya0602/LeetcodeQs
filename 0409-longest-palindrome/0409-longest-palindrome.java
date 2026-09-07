class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        int sum=0;
        boolean hasodd=false;
        for(Integer v: hm.values()){
            sum+=v;
            if(v%2!=0) {
                sum--;
                hasodd=true;
            }
        }
        
        if(hasodd) sum++;
        return sum;
    }
}