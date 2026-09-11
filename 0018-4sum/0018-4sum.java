class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Set<List<Integer>> checkset= new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length,k,l,i,j;
        long newtarget;
        for(i=0;i<n-3;i++){
            for(j=i+1;j<n-2;j++){
                newtarget=(long)target-(nums[i]+nums[j]);
                k=j+1;
                l=n-1;
                while(k<l){
                    if((nums[k]+nums[l])==newtarget){
                        List<Integer> ans=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        if(!checkset.contains(ans)){
                        result.add(ans);
                        checkset.add(ans);
                        }
                        k++;
                        l--;
                    }else if((nums[k]+nums[l])<newtarget) k++;
                    else l--;
                }
            }
        }
        return result;
    }
}