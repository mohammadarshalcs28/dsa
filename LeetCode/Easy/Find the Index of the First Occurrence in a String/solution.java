class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) 
        {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {

                int k;

                for (k = 0; k < needle.length(); k++) {

                    if (haystack.charAt(i + k) != needle.charAt(k)) {
                        break;
                    }
                }

                if (k == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}