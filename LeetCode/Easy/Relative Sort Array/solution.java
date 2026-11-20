class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];
        for (int x : arr1) {
            freq[x]++;
        }
        int index = 0;
        for (int x : arr2) {
            while (freq[x] > 0) {
                arr1[index++] = x;
                freq[x]--;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr1[index++] = i;
                freq[i]--;
            }
        }
        return arr1;
    }
}