class Solution {
    public int majorityElement(int[] nums) {
        int max=0;
        int maj=0;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i:nums){
            
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)>=max){
                max=hm.get(i);
                maj=i;
            }
        }
        
        return maj;
    }
}