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
        this.arg = arg;
        int k = 0;
        double previousValue = 0;
        //while (Math.abs(value - previousValue) > Math.pow(10, -5)) {
        while (k < 5) {
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
