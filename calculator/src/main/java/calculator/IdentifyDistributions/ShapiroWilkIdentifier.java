package calculator.IdentifyDistributions;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * This class is an implementation of the ComplexIdentifier, using the Shapiro Wilk test to check for normality
 * @author Noah Lago ndl3389@rit.edu
 */
public class ShapiroWilkIdentifier implements ComplexIdentifier {

    /**
     * This method conducts a Shapiro Wilk test on the raw data provided, using the skewness and 
     * kurtosis of the data to evaluate whether it can be stated to approximately follow a normal distribution
     * @param data array of double values representing the raw data
     * @return true if the raw data approximately follows a normal distribution
     */
    @Override
    public boolean checkNormality(double[] data){
        DescriptiveStatistics dsStats = new DescriptiveStatistics();
        
        //Convert to data structure usable by the library
        for (double d : data) {
            dsStats.addValue(d);
        }

        //Calculate skewness and kurtosis 
        double skewness = dsStats.getSkewness();
        double kurtosis = dsStats.getKurtosis();

        //check skewness and kurtosis against thresholds
        return (Math.abs(skewness) < 2 && Math.abs(kurtosis) < 3);
    }
}
