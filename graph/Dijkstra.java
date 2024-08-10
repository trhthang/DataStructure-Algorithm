import java.util.HashSet;
import java.util.Set;

public class Dijkstra {

    public static void main(String[] args) {
        int n = 5; // 0 - 4
        int [][] a = {  {0, 6, 0, 1, 9},
                        {6, 0, 5, 2, 2},
                        {0, 5, 0, 0, 5},
                        {1, 2, 0, 0, 1},
                        {0, 2, 5, 1, 0}};

        Set<Integer> visited = new HashSet<Integer>();
        int[] distance = new int[n]; // distance[i] : khoảng cách từ đỉnh đầu cho đến đỉnh i
        int[] previous = new int[n]; // previous[i] : Là đỉnh ngay phía trước của i
        int oo = Integer.MAX_VALUE;

        int start = 0;
        int finish = 2;

        // Bước 1: Khởi tạo khoảng cách
        for (int i = 0; i < n; i++) {
            distance[i] = oo;
        }

        distance[start] = 0;

        while (visited.size() < n) {
            // Bước 2: chọn đỉnh chưa duyệt
            // và đang có khoảng cách nhỏ nhất ( từ đỉnh xuất phát ) làm đỉnh đang xét
            int dangXet = 0;
            int minDist = oo;
            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && distance[i] < minDist) {
                    minDist = distance[i];
                    dangXet = i;
                }
            }
            // Bước 3: Từ đỉnh đang xét, duyệt các ĐỈNH KỀ chưa duyệt:
            // update khoảng cách và đỉnh trước của các đỉnh đó

            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && a[dangXet][i] != 0) {
                    int newDistance = distance[dangXet] + a[dangXet][i];
                    if (newDistance < distance[i]) {
                        distance[i] = newDistance;
                        previous[i] = dangXet;
                    }
                }
            }
            // Bước 4: Đánh dấu đỉnh đang xét thành đỉnh đã duyệt
            visited.add(dangXet);
        }

        System.out.println("Khoảng cách nhỏ nhất từ " + start + " đến "+ finish + ": " + distance[finish]);
        System.out.println("Đường đi là: ");
        int chay = finish;
        while(chay != start) {
            System.out.print(chay + "<-");
            chay = previous[chay];
        }
        System.out.print(chay);
    }
}
