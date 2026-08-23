class Solution {
    public boolean checkDivisibility(int n) {
        int son=0,pon=1,num=n; //sum of numbers and product of numbers 
        while(num>0){
            
            son+=num%10;
            pon*=num%10;

            num/=10;
        }
        return n%(son+pon)==0;
    }
}