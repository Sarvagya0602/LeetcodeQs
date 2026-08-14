class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] visited=new boolean[nums.length];
        for(int i=0;i<n;i++){
            if(i<=nums[0]) visited[i]=true;
            else visited[i]=false;
        }
        for(int i=0;i<n;i++){
            if(visited[i]) {
                for(int j=0;j<=nums[i];j++){
                    if(j+i<n) visited[j+i]=true;
                }
            }
        }
        return visited[n-1];
    }
}