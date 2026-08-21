class Solution {
    public int removeDuplicates(int[] nums) {
        int a = nums.length;
        int count=1;
        for(int i=1;i<a;i++){
            if(nums[i-1]!=nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}