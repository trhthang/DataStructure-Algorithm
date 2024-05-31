//public class _1672_richest_customer_wealth {
//
//    // tự làm :
//    public int maximumWealth(int[][] accounts) {
//
//        int soDong = accounts.length; //2
//        int soCot = accounts[0].length; // 3
//        int best = 0;
//
//
//        for (int i = 0; i < soDong; i++) {
//            int total = 0;
//            for (int j = 0; j < soCot; j++) {
//                total = total + accounts[i][j];
//            }
//
//            if (total >= best) {
//                best = total;
//            }
//
//        }
//        return best;
//    }
//
//    // hướng dẫn :
//
//        public int maximumWealth2(int[][] a) {
//
//            int soKhachHang = a.length;
//            int soNganHang = a[0].length;
//            int[] tongTaiSan = new int[soKhachHang];
//
//            for (int i = 0; i < soKhachHang; i++) {
//                int tinhTongHangI = 0;
//                for (int j = 0; j < soNganHang; j++) {
//                    tinhTongHangI = a[soKhachHang][soNganHang];
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] a = { {1,2,3}, {3,2,1} };
//        // int[][] b = new int[2][3];
//
//        // int soDong = a.length; //2
//        // int soCot = a[0].length; // 3
//        // int best = 0;
//
//        // for (int i = 0; i < soDong; i++) {
//
//        //     for (int j = 0; j < soCot; j++) {
//        //         System.out.println(a[i][j]);
//        //     }
//
//        // }
//
//        // System.out.println("So hang: " + soDong);
//        // System.out.println("So cot: " + soCot);
//    }
//}
