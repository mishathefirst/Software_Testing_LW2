package test.derivative_functions;

import test.basic.Sinus;

public class Cosinus {

    //TODO: + and - change in cosinus
    public double getCosinus(double x) {
        Sinus sinus = new Sinus();
        return Math.sqrt(1 - Math.pow(sinus.getSinus(x), 2));
    }

}
