package practice;

public class RemoveElement_26 {

    public static int removeElement(int[] nums, int val) {
        // duyệt mảng
        for (int i = 0; i < nums.length -1; i++) {
            if(nums[i] == val) {
                // dịch chuyển mảng
                dichChuyenMang(i, nums);
            }
        }

        if (nums[nums.length - 1] == val) {
            nums[nums.length - 1] = 0;
        }
        return 0;
    }

    private static void dichChuyenMang(int i, int[] nums) {
        nums[i] = nums[i+1];
    }

    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        removeElement(a, 3);
        for (int i = 0; i < a.length; i++) {
            System.err.println(a[i]);
        }
    }
}
