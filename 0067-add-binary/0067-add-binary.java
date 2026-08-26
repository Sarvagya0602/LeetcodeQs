class Solution {
    public String addBinary(String a, String b) {
        String result="";
        boolean carry=false;
        int m=a.length()-1,n=b.length()-1;
        while(m>=0 && n>=0){
            if(carry){
                if(a.charAt(m)=='1' && b.charAt(n)=='1') result="1"+result;
                else if((a.charAt(m)=='0' && b.charAt(n)=='1')
                || (a.charAt(m)=='1' && b.charAt(n)=='0')) {
                    result="0"+result;    
                } else{
                    result="1"+result;
                    carry=false;
                }
            } else{
                if(a.charAt(m)=='1' && b.charAt(n)=='1') {
                    result="0"+result;
                    carry=true;
                } else if((a.charAt(m)=='0' && b.charAt(n)=='1')
                || (a.charAt(m)=='1' && b.charAt(n)=='0')){
                    result="1"+result;
                } else {
                    result="0"+result;
                }
            }
            m--;
            n--;
        }

        while(m>=0){
            if(carry){
                if(a.charAt(m)=='1') result="0"+result;
                else {
                    result="1"+result;
                    carry=false;
                }
            } else {
                result=a.charAt(m)+result;
            }
            m--;
        }

        while(n>=0){
            if(carry){
                if(b.charAt(n)=='1') result="0"+result;
                else {
                    result="1"+result;
                    carry=false;
                }
            } else {
                result=b.charAt(n)+result;
            }
            n--;
        }

        if(carry) result="1"+result;
        return result;
    }
}