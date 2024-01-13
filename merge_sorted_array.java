public class merge_sorted_array {
        
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            // chèn phần tử trong mảng nums vào nums1
            insertNewElementToArray(ai, nums1, m);
            m++;
        }
    }


    private static void insertNewElementToArray(int x, int[] nums1, int m) {
       boolean timDuocK = false;
       for (int k = 0; k < m; k++) {
            if (nums1[k] > x) {
                timDuocK = true;

                // dịch chuyển các phần tử trong mảng nums1
                for (int i = m - 1; i >= k; i--) {
                    nums1[i + 1] = nums1[i];
                }

                nums1[k] = x;
                break;
            }
       }

       if (timDuocK == false) {
            nums1[m] = x;
       }
    }


    public static void main(String[] args) {
        int[] n1 = {2,3,4,5,0,0,0};
        int[] n2 = {0,3,6};
        
        merge(n1,4,n2,3);

        System.out.println("Done");
    }
}
