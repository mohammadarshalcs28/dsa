class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] a=s.toCharArray();
        int start=0;
        int stop=n-1;
        while(start<stop){
            if (!Character.isAlphabetic(a[start])) {
                start++;
            }
            else if (!Character.isAlphabetic(a[stop])) {
                stop--;
            }
            else {
                char temp = a[start];
                a[start] = a[stop];
                a[stop] = temp;

                start++;
                stop--;
            }
        }
        return String.copyValueOf(a);
    }
}