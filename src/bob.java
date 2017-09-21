import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
        System.out.println("What would you like to say to Bob?");
        String conversation = scan.nextLine();
        System.out.println(conversation);

            if (conversation.endsWith("?")){
                System.out.println("Sure");
            } else if (conversation.endsWith("!") || conversation.equals(conversation.toUpperCase()) && !conversation.isEmpty() ) {
                System.out.println("Whoa, chill out!");
            } else if (conversation.isEmpty() ) {
                System.out.println("Fine be that way!");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Continue? y/n?");
            String option = scan.nextLine();
            if(!option.equalsIgnoreCase("y")) {
                break;
            }
        }

//        System.out.println("Enter an integer and a character.");
//        int integer = scan.nextInt();
//        String character = scan.next();
//        System.out.println(integer + character);
//
//        for(int n = 0; n <= integer; n++){
//            System.out.println(character);
//        }
    }
}
