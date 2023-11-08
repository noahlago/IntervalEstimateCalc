package calculator;

/**
 * This class represents a numerical sample with a sample size, sample mean, sample standard deviation
 * @author Noah Lago ndl3389@rit.edu
 */
public class NumSample {
    /**
     * Represents the size of the sample instance
     * Common notation for sample size is "n"
     */
    private int n;
    /**
     * Represents the mean of this specific sample, not of the overall population
     * Common notation for sample mean is "x̄"
     */
    private double x;
    /**
     * Represents the standard deviation of this specific sample, not of the overall population
     * Common notation for sample standard deviation is "s"
     */
    private double s;

    public NumSample(int n, double x, double s){
        this.n = n;
        this.x = x;
        this.s = s;
    }

    public NumSample(double[] x_vals){
        this.n = x_vals.length;
        this.x = SampleUtils.meanFromVals(x_vals);
        this.s = SampleUtils.sFromMean(x_vals, n);
    }

    public int getN() {
        return n;
    }

    public double getS() {
        return s;
    }

    public double getX() {
        return x;
    }
}
