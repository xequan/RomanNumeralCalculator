package bootcamp.db;

/**
 * @author DM53848 on 3/10/2016.
 */
public class RomanNumeralDB {
    private String romanNumeral = "";
    public final int romanX = 10;
    public final int romanL = 50;
    public final int romanC = 100;
    public final int romanD = 500;
    public final int romanM = 1000;
    public final int romanG = 5000;



    public void setRomanNumeral(int number) {

        if (number == 1){
            this.romanNumeral = "I";
        }else if (number == 2) {
            this.romanNumeral = "II";
        }else if (number == 3) {
            this.romanNumeral = "III";
        }else if (number == 4) {
            this.romanNumeral = "IV";
        }else if (number == 5) {
            this.romanNumeral = "V";
        }else if (number == 6) {
            this.romanNumeral = "VI";
        }else if (number == 7) {
            this.romanNumeral = "VII";
        }else if (number == 8) {
            this.romanNumeral = "VIII";
        } else if (number == 9) {
            this.romanNumeral = "IX";
        }else if (number == 10) {
            this.romanNumeral = "X";
        }else if (number == 50) {
            this.romanNumeral = "L";
        }else if (number == 100) {
            this.romanNumeral = "C";
        }else if (number == 500) {
            this.romanNumeral = "D";
        }else if (number == 1000) {
            this.romanNumeral = "M";
        } else if (number == 5000) {
            this.romanNumeral = "G";
        } else {
            this.romanNumeral = "";
        }
    }

    public String getRomanNumeral(){
        return this.romanNumeral;
    }


}
