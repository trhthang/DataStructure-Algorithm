package LinkedList;

public class _206_reverse_linked_list {

    // Định nghĩa cho một nút trong danh sách liên kết đơn.
    public static class ListNode {
        int val;        // Giá trị của nút
        ListNode next;  // Con trỏ đến nút tiếp theo trong danh sách
        ListNode() {}   // Constructor mặc định
        ListNode(int val) { this.val = val; }   // Constructor với giá trị
        ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Constructor với giá trị và nút tiếp theo
    }

    // Hàm để đảo ngược danh sách liên kết
    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head; // Khởi tạo curNode với giá trị của head

        // Duyệt qua danh sách khi curNode và curNode.next không null
        while (curNode != null && curNode.next != null) {
            ListNode nextNode = curNode.next;  // Lưu trữ nút tiếp theo
            curNode.next = nextNode.next;      // Bỏ qua nextNode bằng cách trỏ curNode.next đến nút sau nextNode
            nextNode.next = head;              // Di chuyển nextNode lên đầu bằng cách trỏ nextNode.next đến head hiện tại
            head = nextNode;                   // Cập nhật head để là nextNode
        }

        // Trả về head mới của danh sách liên kết đã được đảo ngược
        return head;
    }

    // Hàm để in danh sách liên kết
    public static void printLinkedList(ListNode head) {
        if(head == null){
            System.out.println("Danh sách liên kết trống"); // In ra nếu danh sách rỗng
        } else {
            ListNode temp = head; // Bắt đầu với nút head
            while(temp != null){  // Duyệt qua toàn bộ danh sách
                System.out.print(temp.val + " "); // In ra giá trị của nút hiện tại
                temp = temp.next; // Di chuyển đến nút tiếp theo
            }
        }
    }

    // Hàm main để kiểm tra hàm reverseList
    public static void main(String[] args) {

        // Tạo danh sách liên kết: 1 -> 2 -> 3 -> 4
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);

        // Liên kết các nút với nhau
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        // Đảo ngược danh sách liên kết và nhận lại head mới
        ListNode head = reverseList(a1);
        // In ra danh sách liên kết đã đảo ngược: nên in 4 3 2 1
        printLinkedList(head);

    }
}
