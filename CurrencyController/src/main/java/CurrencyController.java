import javax.swing.*;

public class CurrencyController {
    public static void main(String[] args) {
        Function function = new Function();
        Object[] option1 = {"Convert to USD", "Convert to EUR", "Quit"};
        Object[] option2 = {"Try again", "Quit"};


        while (true) {

            String input = JOptionPane.showInputDialog(null, "Enter ruble: ");

            if (function.check(input)) {
                Double d = Double.parseDouble(input);


                int choice1 = JOptionPane.showOptionDialog(null,
                        "Choose Which Currency You Wish To Convert " + d + " RUB",
                        "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                if (choice1 == 0) {
                    function.rubleToDollar(d); // convert to USD

                } else if (choice1 == 1) {
                    function.rubleToEuro(d); // convert to EURO
                } else {
                    break;
                }

                int choice2 = JOptionPane.showOptionDialog(null,
                        "What do you wish to do?", "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                if (choice2 == 1) {
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Ruble");

            }

        }
    }
}
