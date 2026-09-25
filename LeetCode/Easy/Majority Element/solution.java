class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int x : nums) {
            mpp.put(x, mpp.getOrDefault(x, 0) + 1);
        }
        int maxFreq = 0;
        int answer = 0;

        for (int x : mpp.keySet()) {
            if (mpp.get(x) > maxFreq) {
                maxFreq = mpp.get(x);
                answer = x;
            }
        }
        return answer;
    }
}