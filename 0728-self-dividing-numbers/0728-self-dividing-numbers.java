class Solution {
    static boolean selfdiv(int n){
        int d=n;
        while(d>0){
            if(d%10==0) return false;
            if(n%(d%10)!=0) return false;
            d/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdiv(i)) result.add(i);
        }
        return result;
        
    }
}