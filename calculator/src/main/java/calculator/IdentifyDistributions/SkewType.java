package calculator.IdentifyDistributions;

public enum SkewType {
    NORMAL("Normal Distribution"),
    POSITIVE("Positively/Right Skewed"),
    NEGATIVE("Negatively/Left Skewed");

    private String skew;

    private SkewType(String skew){
        this.skew = skew;
    }

    public String skewDescription(){
        return this.skew;
    }
}
