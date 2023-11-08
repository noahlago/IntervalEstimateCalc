package calculator;

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
    private int sp;

    public CatSample(int n, int sp){
        this.n = n;
        this.sp = sp;
    }

    public int getN() {
        return n;
    }

    public int getSp() {
        return sp;
    }
}
