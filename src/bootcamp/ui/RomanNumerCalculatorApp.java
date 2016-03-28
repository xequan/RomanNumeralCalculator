package bootcamp.ui;

import bootcamp.business.ConvertToRomanNumeral;
import bootcamp.business.RomanNumeralCalculator;

import java.util.Scanner;

/**
 * Created by DM53848 on 3/10/2016.
 *
 */
public class RomanNumerCalculatorApp {
    public static void main(String[] args) {
        RomanNumeralCalculator test = new RomanNumeralCalculator(getUserInput(), getUserInput());
        System.out.println(test.returnResults());

    }

    public static int getUserInput() {
        Scanner inputScanner = new Scanner(System.in);
        int userInput = 0;


        System.out.println("Enter a number: ");
        userInput = Integer.parseInt(inputScanner.next());

        return userInput;
    }

}
