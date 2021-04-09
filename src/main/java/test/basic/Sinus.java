package test.basic;

public class Sinus {
    double arg = 0, value = 0;

    public Sinus() {}
    public Sinus (double arg) {
        this.arg = arg;
        this.value = getSinus(arg);
    }

    public double getValue() {
        return value;
    }


    public double getSinus(double arg) {
        int period = 0;
        if (arg > Math.PI) {
            period = (int) (arg / Math.PI);
            arg = arg % Math.PI;
            if (period % 2 != 0) {
                arg = -arg;
            }
        }
        this.arg = arg;
        int k = 0;
        double previousValue = -100;
        while (Math.abs(value - previousValue) > Math.pow(10, -2)) {
            previousValue = value;
            value = value + ((Math.pow(-1, k) * Math.pow(arg, (2 * k + 1)) / getFactorial(2 * k + 1)));
            k++;
        }
        return value;
    }

    private int getFactorial(int arg) {
        if (arg == 0 || arg == 1) {
            return 1;
        } else if (arg == 2) {
            return 2;
        } else {
            return getFactorial(arg - 1) * arg;
        }
    }

}
