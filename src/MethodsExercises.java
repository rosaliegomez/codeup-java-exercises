import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(2,3));
    subtraction(9,2);
    multiplication(5,6);
    division(40,8);
    modulus(42, 8);

    getInteger(1, 10);
    getFactorial(6);

    roll();

    }
    public static int addition(int x, int y){
        return x+y;
    }
    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }
    public static void multiplication(int c, int d){
        System.out.println(c * d);
    }
    public static void division(int n, int i){
        System.out.println(n / i);
    }
    public static void modulus(int p, int s){
        System.out.println(p % s);
    }

    public static int getInteger(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
            if (number > max || number < min) {
                System.out.println("Try another number.");
                return getInteger(min, max);
            } else {
                System.out.println("Your number is " + number);
                return number;
            }
    }
    public static void getFactorial(int num){
        System.out.println("Enter a number between 1 and 10");
        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();
        System.out.println(num);
        scan.nextLine();

        System.out.println("do you want to continue? y/n");
        String option = scan.nextLine();
        System.out.println(option);
        if(!option.equalsIgnoreCase("y")){
            System.out.println("end");
        }
        if(num == 0 || num == 1){
            System.out.println("1");
        }


        for(int i = num -1; i >= 1; i--){
            num = num *i ;
        }
            System.out.println(num);

    }
    public static void roll(){
        Scanner scan = new Scanner(System.in);
        String userWantsToContinue;
        do {
            System.out.println("Enter the number of sides for a pair of dice");
            int number = scan.nextInt();

            System.out.println(number);
            double die1 = Math.floor(Math.random() * number) + 1;
            double die2 = Math.floor(Math.random() * number) + 1;
            System.out.println("First roll is " + die1 + " Second roll is " + die2);
            System.out.println("Do you want to continue? y/n?");
            scan.nextLine();
            userWantsToContinue = scan.nextLine();
        } while(userWantsToContinue.equalsIgnoreCase("y") || (userWantsToContinue.equalsIgnoreCase("yes")));


    }
}
