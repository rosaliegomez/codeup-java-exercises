package util;

import java.util.Scanner;

public class Input {

    private Scanner scan = new Scanner(System.in);


    public String getString(String prompt){
        System.out.println(prompt);
        String stringInput = scan.nextLine();
        System.out.println(stringInput);
        return stringInput;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String yesOrNo = scan.nextLine();
        System.out.println(yesOrNo.equalsIgnoreCase("yes"));
        return true;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        int number = scan.nextInt();
        System.out.println(number);
        return number;
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between 1 and 100.");
        int newNumber = scan.nextInt();
        if (newNumber> 1 && newNumber < 100){
            System.out.println(newNumber);
        } else{
            getInt(min, max);
        }

        return newNumber;
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter number between 1 and 10.");
        double newDouble = scan.nextDouble();
        if (newDouble <= 10 && newDouble >= 1){
            System.out.println(newDouble);
        } else {
            getDouble(min, max);
        }return newDouble;
    }

    public double getDouble(){
        System.out.println("Enter a decimal number");
        double newishDouble = scan.nextDouble();
        System.out.println(newishDouble);
        return newishDouble;
    }

}
