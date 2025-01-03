package calculator.IdentifyDistributions;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest;

import calculator.SampleUtils;


public class KolmogrovSmirnovIdentifier implements ComplexIdentifier{

    double threshold = 0.05;

    @Override
    public boolean checkNormality(double[] data) {
        double mean = SampleUtils.meanFromVals(data);

        double var = 0;

        for (double d : data) {
            var += Math.pow(d - mean, 2);
        }

        double stdDev = Math.sqrt(var / data.length);

        NormalDistribution normal = new NormalDistribution(mean, stdDev);

        double result = (new KolmogorovSmirnovTest()).kolmogorovSmirnovTest(normal, data);

        return result > threshold;
    }

}
