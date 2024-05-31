import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * test
 */


 //                     [1,2,3,4]

 // result left = [] --> [1,2,2,6] R = 1*4 =4
 // product right =       [ 8,6]


 // [2,3,-2,4]
public class test {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp;
                temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

        // Cập nhật maxProduct
        if (nums[i] > maxProduct * nums[i]) {
            maxProduct = nums[i];
        } else {
            maxProduct = maxProduct * nums[i];
        }

        // Cập nhật minProduct
        if (nums[i] < minProduct * nums[i]) {
            minProduct = nums[i];
        } else {
            minProduct = minProduct * nums[i];
        }


            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        System.err.println("thang");
    }
    
}