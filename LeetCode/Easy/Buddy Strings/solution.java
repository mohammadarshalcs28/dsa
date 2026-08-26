class Solution {
    public boolean buddyStrings(String s, String goal) {

        int n = s.length();
        int k = goal.length();

        // Length must be same
        if (n != k) {
            return false;
        }

        char a[] = new char[n];
        char b[] = new char[k];

        // Copy strings into arrays
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i);
            b[i] = goal.charAt(i);
        }

        int count = 0;
        int first = -1;
        int second = -1;

        // Find different positions
        for (int i = 0; i < n; i++) {

            if (a[i] != b[i]) {

                count++;

                if (count == 1) {
                    first = i;
                }

                if (count == 2) {
                    second = i;
                }
            }
        }

        // More than 2 differences
        if (count > 2) {
            return false;
        }

        // Exactly 2 differences
        if (count == 2) {

            // Swap the two characters in b
            char temp = b[first];
            b[first] = b[second];
            b[second] = temp;

            // Compare after swapping
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

            return true;
        }

        // No differences
        // Need at least one duplicate character
        if (count == 0) {

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (a[i] == a[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}