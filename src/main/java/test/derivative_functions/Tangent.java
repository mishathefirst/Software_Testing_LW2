package test.derivative_functions;

import test.basic.Sinus;

public class Tangent {

    public double getTangent(double x) {
        return new Sinus().getSinus(x) / new Cosinus().getCosinus(x);
    }

}
