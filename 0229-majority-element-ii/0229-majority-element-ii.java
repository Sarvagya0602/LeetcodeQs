class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int cnt=0;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            cnt++;
        }
        cnt/=3;
        List<Integer> result=new ArrayList<>();
        for(Integer Key:hm.keySet()){
            if(hm.get(Key)>cnt) result.add(Key);
        }
        return result;
    }
}