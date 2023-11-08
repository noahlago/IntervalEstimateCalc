package calculator;

/**
 * 
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
    private int x;
    /**
     * Represents the standard deviation of this specific sample, not of the overall population
     * Common notation for sample standard deviation is "s"
     */
    private int s;

    public NumSample(int n, int x, int s){
        this.n = n;
        this.x = x;
        this.s = s;
    }

    public int getN() {
        return n;
    }

    public int getS() {
        return s;
    }

    public int getX() {
        return x;
    }
}
