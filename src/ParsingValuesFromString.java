import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ParsingValuesFromString {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
//        String numberAsString = "2018.125";
//        double number = Double.parseDouble(numberAsString);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);


    }
}
