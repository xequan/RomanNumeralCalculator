package bootcamp.business;

/**
 * Created by DM53848 on 3/10/2016.
 */
public class RomanNumeralCalculator {
    private int result;
    private int firstNumber;
    private int secondNumber;


    public RomanNumeralCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        add(this.firstNumber, this.secondNumber);
    }

    private void add(int firstNumber, int secondNumber){
        this.result = firstNumber + secondNumber;
    }

    public String returnResults(){
        String message = "";

        message = "You entered ";
        ConvertToRomanNumeral romanNumeral = new ConvertToRomanNumeral(this.firstNumber);
        message += romanNumeral.getRomanNumeral();
        message += " and ";
        romanNumeral = new ConvertToRomanNumeral(this.secondNumber);
        message += romanNumeral.getRomanNumeral();
        message += " and the sum is ";
        romanNumeral = new ConvertToRomanNumeral(this.result);
        message += romanNumeral.getRomanNumeral();

        return message;

    }

}
