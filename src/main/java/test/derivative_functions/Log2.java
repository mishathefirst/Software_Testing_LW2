package test.derivative_functions;

import test.basic.NaturalLogarithm;

public class Log2 {

    public double getLog2 (double arg) {
        if (arg > 0) {
            NaturalLogarithm logn = new NaturalLogarithm();
            //log2(e) is a const being approx. equal to 1.442695
            return logn.getNLogarithm(arg) * 1.442695;
        } else {
            throw new ArithmeticException();
        }
    }

}
