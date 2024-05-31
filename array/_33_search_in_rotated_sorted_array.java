package array;

public class _33_search_in_rotated_sorted_array {
    public static int search(int[] nums, int target) {

        int iLeft = 0, iRight = nums.length - 1;

        // Tìm phần tử nhỏ nhất trong 1 mảng đã sắp xếp nhưng bị xoay (rotated)
        while (iLeft < iRight) {
            int midPoint = iLeft + (iRight - iLeft) / 2;
            if (nums[midPoint] > nums[iRight]) {
                iLeft = midPoint + 1;
            } else {
                iRight = midPoint;
            }
        }

        int start = iLeft; // pivot
        iLeft = 0;
        iRight = nums.length - 1;

        // Xác định phạm vi tìm kiếm dựa trên target và pivot
        if (target >= nums[start] && target < nums[iRight]) {
            iLeft = start;
        }else {
            iRight = start - 1;
        }

        // Tìm kiếm nhị phaan :
        while (iLeft <= iRight) {
            int mid = iLeft + (iRight - iLeft) / 2;
            if (target == nums[mid]) {
                return mid;
            }else if (nums[mid] > target) {
                iRight = mid - 1;
            }else {
                iLeft = mid + 1;
            }
        }

        return -1;
    }
}
