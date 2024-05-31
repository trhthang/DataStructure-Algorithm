package array;

public class _152_maximum_product_subarray {
    public int maxProduct(int[] nums) {
        // Kiểm tra nếu mảng rỗng hoặc null
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Khởi tạo max_product, min_product và result với giá trị đầu tiên của mảng
        int max_product = nums[0];
        int min_product = nums[0];
        int result = nums[0];

        // Duyệt qua mảng từ phần tử thứ hai đến cuối
        for (int i = 1; i < nums.length; i++) {
            // Nếu phần tử hiện tại là số âm, hoán đổi max_product và min_product
            // vì số âm nhân với số âm sẽ thành số dương
            if (nums[i] < 0) {
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }

            // Cập nhật max_product và min_product với giá trị lớn nhất và nhỏ nhất tương ứng
            max_product = Math.max(nums[i], max_product * nums[i]);
            min_product = Math.min(nums[i], min_product * nums[i]);

            // Cập nhật result nếu max_product hiện tại lớn hơn result
            result = Math.max(result, max_product);
        }

        // Trả về kết quả là tích lớn nhất của một dãy con liên tiếp
        return result;
    }

}
