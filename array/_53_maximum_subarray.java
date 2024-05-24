package array;
// Ý tưởng bài này là: Bắt đầu một dãy con mới nếu giá trị của phần tử hiện tại lớn hơn tổng của dãy con hiện tại cộng với phần tử hiện tại.
// Tiếp tục dãy con hiện tại nếu tổng của dãy con hiện tại cộng với phần tử hiện tại lớn hơn giá trị của phần tử hiện tại. 
// Và tìm dãy có tổng lớn nhất!!
public class _53_maximum_subarray {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
