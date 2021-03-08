package test.basic;

public class NaturalLogarithm {

    double arg = 0, value = 0;

    public NaturalLogarithm() {}
    public NaturalLogarithm (double arg) {
        this.arg = arg;
        this.value = getNLogarithm(arg);
    }

    public double getValue() {
        return value;
    }

    public double getNLogarithm(double arg) {
        this.arg = arg;
        int k = 0;
        double previousValue = -100;
        while (Math.abs(value - previousValue) > Math.pow(10, -5)) {
            previousValue = value;
            value = value + ((Math.pow(-1, k) * Math.pow((arg - 1), (k + 1)) / (k + 1)));
            k++;
        }
        return value;
    }
}
