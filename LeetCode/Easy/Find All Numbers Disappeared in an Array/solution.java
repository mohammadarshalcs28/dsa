class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int j = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == j) {
                j++;
            }
            else if (nums[i] > j) {
                ans.add(j);
                j++;
                i--;
            }
        }

        while (j <= nums.length) {
            ans.add(j);
            j++;
        }

        return ans;
    }
}