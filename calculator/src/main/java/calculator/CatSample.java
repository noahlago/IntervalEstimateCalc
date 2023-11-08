package calculator;

/**
 * This class represents a categorical sample with a sample size, sample proportion, sample standard deviation
 * @author Noah Lago ndl3389@rit.edu
 */
public class CatSample {
    /**
     * Represents the size of the sample instance
     * Common notation for sample size is "n"
     */
    private int n;
    /**
     * Represents the proportion of this specific sample, not of overall population
     * Common notation for sample proportion is "p̂"
     */
    private double sp;

    public CatSample(int n, double sp){
        this.n = n;
        this.sp = sp;
    }

    public int getN() {
        return n;
    }

    public double getSp() {
        return sp;
    }
}
