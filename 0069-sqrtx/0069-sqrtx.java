class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int beg=0,end=x,mid=-1;
        while(beg<=end){
            mid=(beg+end)/2;
            if((long)mid*mid>(long)x) end= mid-1;
            else if(mid*mid==x) return mid;
            else beg=mid+1;
        }
        return end;
    }
}