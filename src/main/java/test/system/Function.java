package test.system;

import test.basic.Sinus;
import test.derivative_functions.Log2;
import test.derivative_functions.Tangent;

public class Function {

    double arg, value;
    public double getFuncValue(double x) {
        if (x <= 0) {
            return ((getSinus(x) / getTan(x)) / getTan(x));
        } else {
/*
            return (((((log_3(x) + log_2(x)) / ln(x)) * (log_2(x) * ln(x))) +
                    (log_10(x) * ((log_10(x) * log_3(x)) ^ 3))) -
                    (((log_5(x) / log_3(x)) * ((log_2(x) / log_10(x)) ^ 3)) ^ 2));

 */

        }
        return 0;
    }

    private double getSinus(double x) {
        return new Sinus().getSinus(x);
    }

    private double getTan(double x) {
        return new Tangent().getTangent(x);
    }

    private double log_2(double x) {
        return new Log2().getLog2(x);
    }

}
