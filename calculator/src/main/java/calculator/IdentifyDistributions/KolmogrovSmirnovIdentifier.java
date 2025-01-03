package calculator.IdentifyDistributions;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest;

import calculator.SampleUtils;

/**
 * This class is an implementation of the ComplexIdentifier, using the Kolmogrov Smirnov test to check for normality
 * @author Noah Lago ndl3389@rit.edu
 */
public class KolmogrovSmirnovIdentifier implements ComplexIdentifier{

    //Pass/fail threshold to determine if the data is "close enough" to normal distribution
    double threshold = 0.05;

    /**
     * This method checks whether the provided raw data follows a normal distribution by comparing
     * the raw data to a reference normal distribution with the same mean and standard deviation as the raw data. 
     * @param data represents the raw data to be evaluated as a double array
     * @return true if the data closely follows a normal distribution
     */
    @Override
    public boolean checkNormality(double[] data) {
        double mean = SampleUtils.meanFromVals(data);

        double var = 0;

        //Sum variance to use for standard deviation calc
        for (double d : data) {
            var += Math.pow(d - mean, 2);
        }

        double stdDev = Math.sqrt(var / data.length);

        //Reference normal distribution
        NormalDistribution normal = new NormalDistribution(mean, stdDev);

        //Perform test to check how closely the data mimics a normal distribution with the same mean and standard deviation
        double result = (new KolmogorovSmirnovTest()).kolmogorovSmirnovTest(normal, data);

        return result > threshold;
    }

}
