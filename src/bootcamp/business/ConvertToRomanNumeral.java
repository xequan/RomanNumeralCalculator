package bootcamp.business;

import bootcamp.db.RomanNumeralDB;

/**
 * Created by DM53848 on 3/10/2016.
 */
public class ConvertToRomanNumeral {
    private String romanNumeral = "";
    private int integerResult = 0;

    public ConvertToRomanNumeral(int integerResult) {
        this.integerResult = integerResult;
        setRomanNumeral();
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

    private void setRomanNumeral(){
        RomanNumeralDB myRomanNumeralDB = new RomanNumeralDB();

        generateRomanNumeralDigits(myRomanNumeralDB.romanG, myRomanNumeralDB);
        myRomanNumeralDB.setRomanNumeral(this.integerResult);
        generateRomanNumeralDigits(myRomanNumeralDB.romanM, myRomanNumeralDB);
        myRomanNumeralDB.setRomanNumeral(this.integerResult);
        generateRomanNumeralDigits(myRomanNumeralDB.romanD, myRomanNumeralDB);
        myRomanNumeralDB.setRomanNumeral(this.integerResult);
        generateRomanNumeralDigits(myRomanNumeralDB.romanC, myRomanNumeralDB);
        myRomanNumeralDB.setRomanNumeral(this.integerResult);
        generateRomanNumeralDigits(myRomanNumeralDB.romanL, myRomanNumeralDB);
        myRomanNumeralDB.setRomanNumeral(this.integerResult);
        generateRomanNumeralDigits(myRomanNumeralDB.romanX, myRomanNumeralDB);
        myRomanNumeralDB.setRomanNumeral(this.integerResult);

        this.romanNumeral += myRomanNumeralDB.getRomanNumeral();
    }



    private int generateRomanNumeralDigits(int romanNumber, RomanNumeralDB romanNumeralDB) {
        int dividend = 0;
        int nextHighestRomanNumber = 0;

        dividend = this.integerResult / romanNumber;

        if (dividend <= 3 && (this.integerResult < 90 || this.integerResult >= 100)) {
            for (int i = 0; i < dividend; i ++){
                romanNumeralDB.setRomanNumeral(romanNumber);
                this.romanNumeral += romanNumeralDB.getRomanNumeral();
                this.integerResult = this.integerResult - romanNumber;
            }
        } else if (dividend <= 3 && (this.integerResult >= 90 || this.integerResult < 100)) {
            this.romanNumeral += "XC";
            this.integerResult = this.integerResult - 90;
        } else {
            romanNumeralDB.setRomanNumeral(romanNumber);
            this.romanNumeral += romanNumeralDB.getRomanNumeral();
            nextHighestRomanNumber = getNextHighestRomanInteger(romanNumber, romanNumeralDB);
            romanNumeralDB.setRomanNumeral(nextHighestRomanNumber);
            this.romanNumeral += romanNumeralDB.getRomanNumeral();
            this.integerResult = this.integerResult -(nextHighestRomanNumber - romanNumber);
        }
        return this.integerResult;
    }

    public int getNextHighestRomanInteger(int romanNumber, RomanNumeralDB romanNumeralDB) {


        if (romanNumber == romanNumeralDB.romanX) {
            return romanNumeralDB.romanL;
        } else if (romanNumber == romanNumeralDB.romanL) {
            return romanNumeralDB.romanC;
        } else if (romanNumber == romanNumeralDB.romanC) {
            return romanNumeralDB.romanD;
        }else if (romanNumber == romanNumeralDB.romanD) {
            return romanNumeralDB.romanM;
        }else if (romanNumber == romanNumeralDB.romanM) {
        return romanNumeralDB.romanG;
    }
        return 0;
    }
}
