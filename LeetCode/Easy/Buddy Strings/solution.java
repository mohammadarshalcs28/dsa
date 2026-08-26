class Solution {

    public boolean buddyStrings(String s, String goal) {

        int n = s.length();
        int k = goal.length();

        int count = 0;

        if (n != k) {
            return false;
        }

        char a[] = new char[n];
        char b[] = new char[k];
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i);
            b[i] = goal.charAt(i);
        }

        // Find differences
        for (int i = 0; i < n; i++) {

            if (a[i] != b[i]) {
                count++;
            }
        }

        // More than 2 differences
        if (count > 2) {
            return false;
        }

        // Exactly 2 differences
        if (count == 2) {

            int first = -1;
            int second = -1;

            for (int i = 0; i < n; i++) {

                if (a[i] != b[i]) {

                    if (first == -1) {
                        first = i;
                    } else {
                        second = i;
                    }
                }
            }

            // Swap
            char temp = b[first];
            b[first] = b[second];
            b[second] = temp;

            // Check if equal
            for (int i = 0; i < n; i++) {

                if (a[i] != b[i]) {
                    return false;
                }
            }

            return true;
        }
        if (count == 0) {

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    if (a[i] == a[j]) {
                        return true;
                    }
                }
            }

            return false;
        }
        return false;
    }
}