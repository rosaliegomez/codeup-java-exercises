import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        long x = 2;
        do{
            System.out.println(x);
            x *=x;
        } while (x < 1000000);

        for (int eye = 5; eye <= 15; eye ++){
            System.out.println("Eye is: " + eye);
        }

        for (long ex = 2; ex < 1000000; ex*=ex){
            System.out.println(ex);
        }

        for(int f = 0; f <= 100; f++) {
            if (f % 3 == 0 & f % 5 ==0) {
                System.out.println("FizzBuzz");
                continue;
            } else if(f % 3 == 0) {
                System.out.println("fizz");
                continue;
            } else if (f % 5 ==0) {
                System.out.println("buzz");
                continue;
            }
            System.out.println(f);
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int number = scan.nextInt();
        System.out.println(number);

        System.out.println("|---------------------------|");
        System.out.println("|  number " + "|" + "squared " + "|" + " cubed  |");
        System.out.println("|---------------------------|");

        for(int newNumber = 1; newNumber <= number; newNumber++) {
            String spaceLeft = String.format("%-5s", "|");
            String spaceRight = String.format("%5s", "|");
            String middle = String.format("    |   ");
            String smallerRightSpace = String.format("%3s", "|");
            String smallRightSpace = String.format("%4s", "|");
            String smallMiddle = "   |   ";
            if(newNumber <= 2){
                System.out.println(spaceLeft + newNumber + middle + newNumber* newNumber + middle + newNumber * newNumber * newNumber + spaceRight);
            } else if (newNumber <=3){
                System.out.println(spaceLeft + newNumber + middle + newNumber* newNumber + middle + newNumber * newNumber * newNumber + smallRightSpace);
            } else if (newNumber <= 4){
                System.out.println(spaceLeft + newNumber + middle + newNumber* newNumber + smallMiddle + newNumber * newNumber * newNumber + smallRightSpace);
            } else if (newNumber <= 5) {
                System.out.println(spaceLeft + newNumber + middle + newNumber* newNumber + smallMiddle + newNumber * newNumber * newNumber + smallerRightSpace);
            }



        }

        scan.nextLine();
        System.out.println("Do you want to continue? y/n");
        String option = scan.nextLine();


//        if(!option.equalsIgnoreCase( "y")){
//            System.out.println("ok, goodbye.");
//            break;
//        }


        System.out.println("What is the grade?");
        int grade = scan.nextInt();
        System.out.println(grade);

        if(grade > 95){
            System.out.println("a+");
        } else if (grade >= 88){
            System.out.println("a-");
        } else if (grade >= 85) {
            System.out.println("b+");
        } else if (grade >= 80) {
            System.out.println("b-");
        } else if (grade >= 75) {
            System.out.println("c+");
        } else if (grade >=70) {
            System.out.println("c-");
        } else if (grade >= 65) {
            System.out.println("d+");
        } else if (grade >= 60){
            System.out.println("d-");
        } else if (grade < 60) {
            System.out.println("f");
        }



    }
}
