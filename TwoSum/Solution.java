// It isn't better choice, but it's my solution
// Speed: O(n)
// Memory: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        Arrays.sort(nums);
        int max = nums.length - 1;
        int min = 0;
        while (max > min) {
            int sum = nums[max] + nums[min];
            if (sum == target) {
                return new int[]{list.indexOf(nums[min]), list.lastIndexOf(nums[max])};
            }
            if (sum > target) {
                max--;
            }
            if (sum < target) {
                min++;
            }
        }
        return null;
    }
}
