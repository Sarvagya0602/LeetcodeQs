class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time=0,floor=0;
        for(int i:requests){
            time+=Math.abs(floor-i);
            floor=i;
        }
        return time;
    }
}