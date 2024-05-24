package array;

// ý tưởng bài này là tính tích các số bên trái trước và sau đó nhân với tích bên phải

public class _238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];

        int[] left_product = new int[N];
        int[] right_product = new int[N];

        left_product[0] = 1;
        right_product[N-1] = 1;

        for (int i = 1; i < N; i++) {
            left_product[i] = nums[i - 1] * left_product[i-1]; 
        }

        for (int i = N - 2; i >= 0; i--) {
            right_product[i] = right_product[i+1] * nums[i+1];
        }

        for (int i = 0; i < N; i++) {
            result[i] = left_product[i] * right_product[i];
        }
        return result;
    }

    // input = [1,2,3,4]

    // left = [1, 1, 2, 6]
    // right = [ 24,12,4,1]
    // output = [24,12,8,6]

    public int[] productExceptSelf2(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];

        result[0] = 1;

        for (int i = 0; i < N; i++) {
            result[i] = nums[i-1] * result[i-1];
        }

        int R = 1;

        for (int i = N -1; i >= 0; i--) {
            result[i] = result[i] * R;
            R = R * nums[i];
        }

        return result;
    }
}


// input = [1,2,3,4]

// left = [1, 1, 2, 6]
// right = [ 24,12,4,1]
// output = [24,12,8,6]
