package test;

import test.basic.NaturalLogarithm;
import test.basic.Sinus;
import test.derivative_functions.Log2;
import test.derivative_functions.Tangent;
import test.system.Function;

public class Main {
    public static void main(String[] args) {

        Sinus sinus = new Sinus();
        System.out.println(sinus.getSinus(15));

/*
        NaturalLogarithm nlog = new NaturalLogarithm();
        System.out.println(nlog.getNLogarithm(1.9));

        Tangent tangent = new Tangent();
        System.out.println(tangent.getTangent(0.5));


        Function func = new Function();
        System.out.println(func.getFuncValue(-0.5));


        Log2 log2 = new Log2();
        System.out.println(log2.getLog2(0.5));
         */

    }
}
