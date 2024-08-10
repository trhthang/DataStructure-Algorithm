public class GraphMatrix {

    // Khai báo mảng 2 chiều để lưu trữ ma trận kề và số đỉnh của đồ thị
    private int[][] adjacencyMatrix;
    private int numVertices;

    // Hàm khởi tạo GraphMatrix nhận vào số đỉnh và khởi tạo ma trận kề
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Hàm thêm cạnh giữa hai đỉnh i và j
    public void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1; // Đánh dầu cạnh từ đỉnh i tới đỉnh j
        adjacencyMatrix[j][i] = 1; // vì là đồ thị vô hướng nên cũng đánh dấu từ j tới i
    }

    // Hàm in ma trận kề ra màn hình
    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) { // Lặp qua từng hàng của ma trận
            for (int j = 0; j < numVertices; j++) { // Lặp qua từng cột của ma trận
                System.out.print(adjacencyMatrix[i][j] + " "); // In ra giá trị của phần tử tại hàng i cột j
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printMatrix();
    }
}
