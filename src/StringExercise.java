public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no education We don't need no thought control";
        System.out.println(message.substring(0, 26));
        System.out.println(message.substring(27, 59));
        // or use "we don't need no education \n we don't need no thought control.

        String messageTwo = "Check " + "\"this\" out!, \"s inside of \"s!";
        System.out.println(messageTwo);
        String messageFour = "In windows, the main drive is usually C:\\";
        System.out.println(messageFour);
        String messageThree = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(messageThree);

    }
}
