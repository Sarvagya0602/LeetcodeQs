class Solution {
    static boolean Happy(int n,Set nums){
        if(n==1) return true;
        if(nums.contains(n)) return false;
        nums.add(n);
        int newn=0;
        while(n>0){
            newn+=(n%10)*(n%10);
            n/=10;
        }
        return Happy(newn,nums);
    }
    public boolean isHappy(int n) {
        Set<Integer> nums=new HashSet<>();
        return Happy(n,nums);
    }
}