package practice;

class FindNumberswithEvenNumberofDigits {

    public static int findNumbers(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            //kiểm tra số chữ số của a
            // Nếu số chữ số là chẵn ==> tăng biến đếm lên 1
            if(tinhSoChuSo(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    private static int tinhSoChuSo(int a) {
        int  kq = a ; 
        int count = 0;
        while(kq != 0) {
            kq = kq/10;
            count++;
            a  = kq;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] c = {1233,22,33322,4123131,5123211};

        System.err.println(FindNumberswithEvenNumberofDigits.findNumbers(c));

        System.out.println(tinhSoChuSo(123123123));

    }
}
 