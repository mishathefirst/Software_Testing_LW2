package test.derivative_functions;

import test.basic.NaturalLogarithm;

public class Log3 {

    public double getLog3 (double arg) {
        if (arg > 0) {
            NaturalLogarithm logn = new NaturalLogarithm();
            //log3(e) is a const being approx. equal to 0.910239
            return logn.getNLogarithm(arg) * 0.910239;
        } else {
            throw new ArithmeticException();
        }
    }

}
