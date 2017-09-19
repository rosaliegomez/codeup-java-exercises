import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a variable:");
        int userInput = sc.nextInt();

        System.out.println(userInput);

        System.out.println("Enter three words.");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();
        sc.nextLine();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);


        System.out.println("Enter a sentence.");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.println("Please enter length for classroom");
        String length = sc.nextLine();
        double lngth = Double.parseDouble(length);
        System.out.println("Enter width:");
        String width = sc.nextLine();
        double wdth = Double.parseDouble(width);
        double area = lngth * wdth;
        System.out.println("Area is: " + area);
        double perimeter = (2 * lngth) + (2 * wdth);
        System.out.println("Perimeter is: " + perimeter);


    }

}
