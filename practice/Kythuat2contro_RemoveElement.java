package practice;

public class Kythuat2contro_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        // Duyệt mảng
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        System.out.println(removeElement(a,2));
        System.out.println("done");
    }
}
