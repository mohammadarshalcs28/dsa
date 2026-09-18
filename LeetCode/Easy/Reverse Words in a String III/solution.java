class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            StringBuilder temp = new StringBuilder(word);
            temp.reverse();

            sb.append(temp).append(" ");
        }

        return sb.toString().trim();
    }
}