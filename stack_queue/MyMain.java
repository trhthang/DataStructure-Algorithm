public class MyMain {

    public static void main(String[] args) {
/*        MyArrayStack myArrayStack = new MyArrayStack(3);
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);

        myArrayStack.show();  // Expected output: 1 2 3
        myArrayStack.pop();
        myArrayStack.show();  // Expected output: 1 2
        myArrayStack.pop();
        myArrayStack.show();  // Expected output: 1
        myArrayStack.pop();
        myArrayStack.show();  // Expected output: Stack is empty

        myArrayStack.pop();
        myArrayStack.show();*/

        MyArrayQueue myArrayQueue = new MyArrayQueue(3);
        System.out.println(myArrayQueue.push(1));
        System.out.println(myArrayQueue.push(2));
        System.out.println(myArrayQueue.push(3));
        myArrayQueue.show();

        System.out.println("--------");
        System.out.println(myArrayQueue.pop());
        myArrayQueue.show();

        System.out.println("--------");
        System.out.println(myArrayQueue.pop());
        myArrayQueue.show();

        System.out.println("--------");
        System.out.println(myArrayQueue.pop());
        myArrayQueue.show();

        System.out.println("--------");
        System.out.println(myArrayQueue.pop());
        myArrayQueue.show();

    }
}
