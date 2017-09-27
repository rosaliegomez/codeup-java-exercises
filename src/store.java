import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        store();
    }

    public static void store() {
        System.out.println("Sale, print receipt, or exit");
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        String sale = "sale";
        String printReceipt = "print receipt";
        String exit = "exit";
        int items = 2;

        while (true) {

            if (response.equalsIgnoreCase(sale)) {
                System.out.println("What would you like to buy?");
                String item = scan.nextLine();
                System.out.println(item);
                System.out.println("How much is it?");
                for (int i = 0; i < items; i++) {
                    String price = scan.nextLine();
                    System.out.println(price);
                    System.out.println("How many would you like?");
                    int quantity = scan.nextInt();
                    System.out.println(quantity);
                    scan.nextLine();
                }
                    System.out.println("Would you like to continue? y/n?");
                    String option = scan.nextLine();

                if (!option.equalsIgnoreCase("y")) {
                    return;
                }
            }
        }
    }

//                int total = quantity * price;
//                System.out.println("Total is " + total);


//            } else if (response.equalsIgnoreCase(printReceipt)) {
//                System.out.println("Printing Receipt");
//            } else if (response.equalsIgnoreCase(exit)) {
//                System.out.println("Will exit");
//            }


}
