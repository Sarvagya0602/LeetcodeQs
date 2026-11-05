class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] vals ={0,0,0};
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                vals[0]++;
            } else if(bills[i]==10 ){
                vals[1]++;
                if(vals[0]<1) return false;
                vals[0]--;
            } else if(bills[i]==20){
                vals[2]++;
                if(vals[1]>0 && vals[0]>0){
                    vals[1]--;
                    vals[0]--;
                } else if(vals[0]>2){
                    vals[0]-=3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}