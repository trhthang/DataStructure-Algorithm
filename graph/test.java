import java.util.Scanner;

public class test {

    enum Priority {
        HIGH, MEDIUM, LOW
    }

    enum MessageType {

        A(Priority.HIGH),
        B(Priority.MEDIUM),
        C(Priority.LOW),
        D(Priority.LOW);


        private final Priority priority;

        MessageType(Priority priority) {
            this.priority = priority;
        }

        public Priority getPriority() {
            return priority;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter message type to check it priority: ");
            String userInput = sc.next();

            if (isValidMessageType(userInput)) {
                MessageType messageType = MessageType.valueOf(userInput);
                System.out.println("Message type: " + messageType + ", priority: " + messageType.getPriority());
                break;
            } else {
                System.out.println("Please, enter valid "
                        + "message type. Only 'A', 'B', 'C' or 'D' are allowed");
            }
            sc.close();

        }
    }

    private static boolean isValidMessageType(String userInput) {
		try {
            MessageType.valueOf(userInput);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
