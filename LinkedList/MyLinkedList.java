package LinkedList;

public class MyLinkedList {

    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if(head == null){
            System.out.println("LinkedList is empty");
        }else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
        }
    }

    // Thêm phần tử vào đầu của LinkedList
    public static Node addToHead(Node head, int value) {
        Node newNode = new Node(value);

        if(head != null){
            newNode.next = head;
        }
        return newNode;
    }

    // Thêm phần tử vào cuối của LinkedList
    public static Node addToTail(Node head, int value) {
        Node newNode = new Node(value);
        if(head != null){
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return head;
    }

    //Thêm 1 phần tử vào giữa
    public static Node addToIndex(Node headNode, int value, int index) {
        if(index == 0){
            return addToHead(headNode, value);
        }else {
            // B1: Tìm vị trí cần thêm
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while(curNode != null) {
                count++;
                if (count == index) {
                    // Thực hiện add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }

        return headNode;
    }

    // Xóa phần tử ở đầu
    public static Node removeAtHead(Node headNode) {
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }

    // Xóa phần tử ở cuối
    public static Node removeFromTail(Node headNode) {
        if (headNode == null){
            return null;
        }

        // Xác định last và previous Node.
        Node lastNode = headNode;
        Node prevNode = null;

        while (lastNode.next != null) { // lastNode.next = null
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if (prevNode == null) {
            return null;
        }else {
            prevNode.next = lastNode.next;
        }

        return headNode;
    }

    // xóa phần tử ở giữa
    public static Node removeAtIndex(Node headNode, int index) {
        if (headNode == null || index < 0){
            return null;
        }

        if(index == 0){
            return removeAtHead(headNode);
        }

        Node curNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean isFound = false;

        while(curNode != null){
            if (count == index) {
                // remove curNode
                isFound = true;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
        }

        // Remove currNode;
        if(isFound){
            if (prevNode == null) { // curNode là lastnode
                return null;
            }else {
                prevNode.next = curNode.next;
            }
        }

        return headNode;
    }


    public static void main(String[] args) {
        Node  n1 = new Node(1);
        Node  n2 = new Node(2);
        Node  n3 = new Node(3);
        Node  n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

//        Node newList = addToHead(n1, 0);
//        Node newList = addToTail(n1, 4);
//        Node newList = addToIndex(n1, 12, 2);
//        Node newList = removeAtHead(n1);
        n1 = removeAtIndex(n1, 3);
        printLinkedList(n1);


//        n1 = removeAtIndex(n1, 1);
//        printLinkedList(n1);
//
//        n1 = removeAtIndex(n1, 2);
//        printLinkedList(n1);
    }
}
