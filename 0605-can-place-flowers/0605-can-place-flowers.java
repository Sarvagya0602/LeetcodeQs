class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int fl=flowerbed.length,count=n;
        for(int i=0;i<fl;i++){
            if(count==0) return true;
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == fl - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    count--;
                }
            }
        }
        return count==0;
    }
}