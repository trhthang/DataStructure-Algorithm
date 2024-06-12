public class MyMain {

    public static void main(String[] args) {
//        MyArrayStack myArrayStack = new MyArrayStack(3);
//        myArrayStack.push(1);
//        myArrayStack.push(2);
//        myArrayStack.push(3);
//
//        myArrayStack.show();  // Expected output: 1 2 3
//        myArrayStack.pop();
//        myArrayStack.show();  // Expected output: 1 2
//        myArrayStack.pop();
//        myArrayStack.show();  // Expected output: 1
//        myArrayStack.pop();
//        myArrayStack.show();  // Expected output: Stack is empty
//
//        myArrayStack.pop();
//        myArrayStack.show();

//        MyArrayQueue myArrayQueue = new MyArrayQueue(3);
//        System.out.println(myArrayQueue.push(1));
//        System.out.println(myArrayQueue.push(2));
//        System.out.println(myArrayQueue.push(3));
//        myArrayQueue.show();
//
//        System.out.println("--------");
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.show();
//
//        System.out.println("--------");
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.show();
//
//        System.out.println("--------");
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.show();
//
//        System.out.println("--------");
//        System.out.println(myArrayQueue.pop());
//        myArrayQueue.show();

//        MyLinkedListStack stack = new MyLinkedListStack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.show();
//
//        System.out.println("--------");
//        System.out.println();
//
//        System.out.println(stack.pop());
//        stack.show();
//
//        System.out.println("--------");
//        System.out.println();
//        System.out.println(stack.pop());
//        stack.show();
//
//        System.out.println("--------");
//        System.out.println();
//        System.out.println(stack.pop());
//        stack.show();

        MyLinkedListQueue queue = new MyLinkedListQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        queue.show();

        System.out.println();
        System.out.println("--------");

        System.out.println(queue.pop());
        queue.show();

        System.out.println("--------");
        System.out.println(queue.pop());
        queue.show();

        System.out.println("--------");
        System.out.println(queue.pop());
        queue.show();


    }
}
