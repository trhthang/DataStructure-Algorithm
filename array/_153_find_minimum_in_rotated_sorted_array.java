package array;

// Input: nums = [3,4,5,1,2]
// Output: 1

// Input: nums = [4,5,6,7,0,1,2]
// Output: 0

// Input: [2,4,5,6,7,0,1]
// Output:  0

public class _153_find_minimum_in_rotated_sorted_array {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
