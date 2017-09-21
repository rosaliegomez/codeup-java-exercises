public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no education We don't need no thought control";
        System.out.println(message.substring(0, 25));
        System.out.println(message.substring(26, 59));

        String messageTwo = "Check " + "\"this\" out!, \"s inside of \"s!";
        System.out.println(messageTwo);
        String messageThree = "I can do backslashes " + "\\" + ", double backslashes " + "\\\\"  + ", and the amazing triple backslash " + "\\\\\\!";
        System.out.println(messageThree);

    }
}
