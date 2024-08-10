import java.util.LinkedList;

public class GraphList {
    // Khai báo mảng danh sách liên kết để lưu trữ danh sách kề và số đỉnh của đồ thị
    private LinkedList<Integer>[] adjacencyList;
    private int numVertices;

    // Hàm khởi tạo GraphList nhận vào số đỉnh và khởi tạo danh sách kề
    public GraphList(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices]; // Khởi tạo mảng danh sách liên kết
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>(); // Khởi tạo danh sách liên kết cho từng đỉnh
        }
    }

    // Hàm thêm cạnh giữa hai đỉnh i và j
    public void addEdge(int i, int j) {
        adjacencyList[i].add(j); // Thêm đỉnh j vào danh sách kề của đỉnh i
        adjacencyList[j].add(i); // Thêm đỉnh i vào danh sách kề của đỉnh  j
    }

    // Hàm in danh sách kề ra màn hình
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Đỉnh: "+ i + " ");
            for (Integer vertex : adjacencyList[i]) {
                System.out.print(" " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphList graphList = new GraphList(4);
        graphList.addEdge(0, 1);
        graphList.addEdge(0, 2);
        graphList.addEdge(1, 2);
        graphList.addEdge(2, 3);

        graphList.printGraph();
    }
}
