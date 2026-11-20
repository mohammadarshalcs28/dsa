class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums1) seen.add(x);
        Set<Integer> common = new HashSet<>();
        for (int x : nums2) if (seen.contains(x)) common.add(x);
        int[] res = new int[common.size()];
        int i = 0;
        for (int x : common) res[i++] = x;
        return res;
    }
}