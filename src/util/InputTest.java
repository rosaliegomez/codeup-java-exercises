package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        input.getString("Enter a string...");
        System.out.println("thanks");

        input.yesNo("Would you like to continue");

        input.getInt("Enter a number");

        input.getIntWithinRange("Enter a number", 1,100);

        input.getDouble(1, 10);

        input.getDouble();

    }
}
