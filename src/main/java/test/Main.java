package test;

import test.basic.NaturalLogarithm;
import test.basic.Sinus;
import test.derivative_functions.Tangent;

public class Main {
    public static void main(String[] args) {
        //Sinus sinus = new Sinus();
        //System.out.println(sinus.getSinus(3.14));

        NaturalLogarithm nlog = new NaturalLogarithm();
        System.out.println(nlog.getNLogarithm(1.9));

        Tangent tangent = new Tangent();
        System.out.println(tangent.getTangent(0.5));

    }
}
