package test.system;

import test.basic.Sinus;

public class Function {

    double arg, value;
    public double getFuncValue(double x) {
        if (x <= 0) {
            return ((getSinus(x) / getTan(x)) / getTan(x));
        } else {
            return (((((log_3(x) + log_2(x)) / ln(x)) * (log_2(x) * ln(x))) +
                    (log_10(x) * ((log_10(x) * log_3(x)) ^ 3))) -
                    (((log_5(x) / log_3(x)) * ((log_2(x) / log_10(x)) ^ 3)) ^ 2));
        }
    }

    private double getSinus(double x) {
        return new Sinus().getSinus(x);
    }

}
