package test.derivative_functions;

import test.basic.NaturalLogarithm;

public class Log5 {

    public double getLog5 (double arg) {
        if (arg > 0) {
            NaturalLogarithm logn = new NaturalLogarithm();
            //log5(e) is a const being approx. equal to 0.621335
            return logn.getNLogarithm(arg) * 0.621335;
        } else {
            throw new ArithmeticException();
        }
    }

}
