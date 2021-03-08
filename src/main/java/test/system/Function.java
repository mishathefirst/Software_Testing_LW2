package test.system;

import test.basic.NaturalLogarithm;
import test.basic.Sinus;
import test.derivative_functions.*;

public class Function {

    double arg, value;
    public double getFuncValue(double x) {
        if (x <= 0) {
            return ((getSinus(x) / getTan(x)) / getTan(x));
        } else {
            return (((((log_3(x) + log_2(x)) / ln(x)) * (log_2(x) * ln(x))) +
                    (log_10(x) * (Math.pow((log_10(x) * log_3(x)), 3))) -
                    (Math.pow((log_5(x) / log_3(x)) * (Math.pow((log_2(x) / log_10(x)), 3)), 2))));
        }
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

    private double log_3(double x) {
        return new Log3().getLog3(x);
    }

    private double log_5 (double x) {
        return new Log5().getLog5(x);
    }

    private double log_10 (double x) {
        return new Log10().getLog10(x);
    }

    private double ln (double x) {
        return new NaturalLogarithm().getNLogarithm(x);
    }

}
