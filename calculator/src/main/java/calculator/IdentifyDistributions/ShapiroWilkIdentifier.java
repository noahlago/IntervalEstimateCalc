package calculator.IdentifyDistributions;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


public class ShapiroWilkIdentifier implements ComplexIdentifier {

    public boolean checkNormality(double[] data){
        DescriptiveStatistics dsStats = new DescriptiveStatistics();
        
        for (double d : data) {
            dsStats.addValue(d);
        }

        double skewness = dsStats.getSkewness();
        double kurtosis = dsStats.getKurtosis();

        return (Math.abs(skewness) < 2 && Math.abs(kurtosis) < 3);
    }
}
