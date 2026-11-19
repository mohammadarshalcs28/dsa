
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int arr[] = new int[m+n];

        int count = 0;
        int a = 0;
        int b = 0;

        while (a < m && b < n) {

            if (nums1[a] <= nums2[b]) {
                arr[count] = nums1[a];
                a++;
            }
            else {
                arr[count] = nums2[b];
                b++;
            }

            count++;
        }

        while (a < m) {
            arr[count++] = nums1[a++];
        }

        while (b < n) {
            arr[count++] = nums2[b++];
        }

        for (int i = 0; i < m+n; i++) {
            nums1[i] = arr[i];
        }
    }
}
