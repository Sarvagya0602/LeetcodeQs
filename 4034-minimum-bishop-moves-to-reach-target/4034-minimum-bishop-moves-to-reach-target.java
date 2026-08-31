class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        if(source==target) return 0;
        if (!((source[0]+source[1])%2==(target[0]+target[1])%2)) return -1;

        int i=source[0],j=source[0];
        while((source[0]+source[1])==(target[0]+target[1]) || (source[0]-source[1])==(target[0]-target[1])) return 1;
        return 2;
        
    }
}