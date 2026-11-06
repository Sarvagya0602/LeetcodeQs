class Solution {
    static void visits(int room,List<List<Integer>> rooms,boolean[] visited){
        if(visited[room]) return;
        visited[room]=true;

        for(int i=0;i<rooms.get(room).size();i++){
            visits(rooms.get(room).get(i),rooms,visited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        // for(int i=0;i<n;i++){
        //     visited[i]=false;
        // }

        visits(0,rooms,visited);
        boolean result=true;
        for(int i=0;i<n;i++){
            result=(result && visited[i]);
        }
        return result;
    }
}