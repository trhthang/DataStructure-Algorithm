public class MyHeap {
    private int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE + 1];
    private int size = 0;

    MyHeap() {
        size = 0;
    }

    public boolean isEmpty() {
        return size <= 0;
    }


}
