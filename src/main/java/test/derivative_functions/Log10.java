package test.derivative_functions;

import test.basic.NaturalLogarithm;

public class Log10 {

    public double getLog10 (double arg) {
        if (arg > 0) {
            NaturalLogarithm logn = new NaturalLogarithm();
            //log10(e) is a const being approx. equal to 0.434294
            return logn.getNLogarithm(arg) * 0.434294;
        } else {
            throw new ArithmeticException();
        }
    }

}
