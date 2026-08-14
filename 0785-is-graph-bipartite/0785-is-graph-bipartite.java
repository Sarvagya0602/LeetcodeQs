class Solution { 
    static boolean dfs(int[][] graph, int node, int nodeclr, int opclr, int[] color, int n) { 
        color[node] = nodeclr; 

        for (int i : graph[node]) {     
            if (color[i] == -1) {    
                if (!dfs(graph, i, opclr, nodeclr, color, n)) 
                    return false;     
            } else if (color[i] == nodeclr)  
                return false; 
        } 
        
        return true; 
    } 
 
    public boolean isBipartite(int[][] graph) { 
        
        int n = graph.length; 
        int[] color = new int[n]; 
        
        for (int i = 0; i < n; i++) color[i] = -1; 
 
        for (int i = 0; i < n; i++) {    
            if (color[i] == -1) {    
                if (dfs(graph, i, 0, 1, color, n) == false) 
                    return false; 
            }
        } 
        return true;         
    } 
}