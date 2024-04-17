//1768 merge string alternatively
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, 
//append the additional letters onto the end of the merged string.
// Return the merged string.
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder m= new StringBuilder();
        int i = 0, j = 0;
        
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                m.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                m.append(word2.charAt(j));
                j++;
            }
        }
        
        return m.toString();
    }
}
