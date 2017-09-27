package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }


    public String getString(String prompt){
        System.out.println(prompt);
        String stringInput = scan.nextLine();
        System.out.println(stringInput);
        return stringInput;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String yesOrNo = scan.nextLine();
        return yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes");
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        int number = scan.nextInt();
        return number;
    }

    public int getIntWithinRange(String prompt, int min, int max){
        int newNumber = getInt(prompt);
        if (newNumber < min && newNumber > max){
            System.out.println("Error - Number must be within range");
        }
        scan.nextLine();
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
