class Solution {

    public int compress(char[] chars) {

        int n = chars.length;

        int i = 0;
        int index = 0;

        while (i < n) {

            int count = 1;
            char a = chars[i];

            for (int k = i + 1; k < n; k++) {

                if (chars[i] == chars[k]) {
                    count++;
                }
                else {
                    break;
                }
            }
            chars[index] = a;
            index++;
            if (count > 1) {

                String countString = String.valueOf(count);

                for (int j = 0; j < countString.length(); j++) {
                    chars[index] = countString.charAt(j);
                    index++;
                }
            }

            i += count;
        }

        return index;
    }
}