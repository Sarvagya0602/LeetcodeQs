class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,hl=haystack.length(),nl=needle.length(),j;
        for (i = 0; i <= hl - nl; i++) {
            j = 0;
            while (j < nl && haystack.charAt(i + j) == needle.charAt(j)) j++;
            if (j == nl) return i;
        }  
        return -1;
    }
}