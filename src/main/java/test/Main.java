package test;

import test.basic.NaturalLogarithm;
import test.basic.Sinus;
import test.derivative_functions.*;
import test.system.Function;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Sinus sinus = new Sinus();
        System.out.println(sinus.getSinus(15));


        NaturalLogarithm nlog = new NaturalLogarithm();
        System.out.println(nlog.getNLogarithm(1.9));

        Tangent tangent = new Tangent();
        System.out.println(tangent.getTangent(0.5));


        Function func = new Function();
        System.out.println(func.getFuncValue(2.2));

 */


        //Log2 log2 = new Log2();
        //System.out.println(log2.getLog2(0.5));

        Main main = new Main();
        main.writeToFile();


    }



    void writeToFile() {
        Date date = new Date();

        try {
            File file = new File(date.getTime() + ".csv");
        file.createNewFile();
        System.out.println(date.getTime());

        //try(FileWriter fw = new FileWriter(file.getName(), false)) {
            FileWriter fw = new FileWriter(file.getName(), false);

            System.out.println("Choose the function to be solved for the row of args:");
            System.out.println("NatLogarithm - 1");
            System.out.println("Sinus - 2");
            System.out.println("Cosinus - 3");
            System.out.println("Log2 - 4");
            System.out.println("Log3 - 5");
            System.out.println("log5 - 6");
            System.out.println("Log10 - 7");
            System.out.println("Tangent - 8");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            fw.write("X,Function(X)");
            fw.append('\n');

            System.out.println("Values \"step\":");

            int step = 1;
            step = scanner.nextInt();
            double funcValue = 0.0;

            for (int i = -25; i < 25; i += step) {
                try {
                    if (choice == 1) {
                        NaturalLogarithm nlog = new NaturalLogarithm();
                        funcValue = nlog.getNLogarithm(i);
                    }
                    if (choice == 2) {
                        Sinus sin = new Sinus();
                        funcValue = sin.getSinus(i);
                    }
                    if (choice == 3) {
                        Cosinus cos = new Cosinus();
                        funcValue = cos.getCosinus(i);
                    }
                    if (choice == 4) {
                        Log2 log2 = new Log2();
                        funcValue = log2.getLog2(i);
                    }
                    if (choice == 5) {
                        Log3 log3 = new Log3();
                        funcValue = log3.getLog3(i);
                    }
                    if (choice == 6) {
                        Log5 log5 = new Log5();
                        funcValue = log5.getLog5(i);
                    }
                    if (choice == 7) {
                        Log10 log10 = new Log10();
                        funcValue = log10.getLog10(i);
                    }
                    if (choice == 8) {
                            Tangent tangent = new Tangent();
                            funcValue = tangent.getTangent(i);
                    }
                    fw.write(i + "," + funcValue);
                    fw.append('\n');
                } catch (ArithmeticException ignored) { }
            }

            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
