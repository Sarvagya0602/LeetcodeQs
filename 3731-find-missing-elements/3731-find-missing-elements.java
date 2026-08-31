class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> hashs=new HashSet<>();
        List<Integer> result=new ArrayList<>();

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            hashs.add(i);
        }

        for(int j=min;j<=max;j++){
            if(!(hashs.contains(j))) result.add(j);
        }
        
        return result;
    }
}