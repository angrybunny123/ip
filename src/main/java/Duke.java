import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";

        System.out.println("Hello! I'm Duke\n" + "What can I do for you?");
        Scanner userInput = new Scanner(System.in);

        while (userInput.hasNext()) {
            String input = userInput.nextLine();
            if (input.equals("bye")) {
                System.out.println("Bye! Hope to see you again soon!");
                break;
            } else {
                System.out.println(input);
            }
        }

    }
}
