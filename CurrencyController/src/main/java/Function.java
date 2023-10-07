import javax.swing.*;

public class Function {

    public boolean check(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    public void rubleToDollar(double d) {
        double dollar = d * 0.0099;
        JOptionPane.showMessageDialog(null, d + " RUB = " + dollar + " USD");
    }

    public void rubleToEuro(double d) {
        double euro = d * 0.0093388121;
        JOptionPane.showMessageDialog(null, d + " RUB  = " + euro + " EUR");
    }
}