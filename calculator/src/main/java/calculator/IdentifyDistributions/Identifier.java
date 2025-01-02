package calculator.IdentifyDistributions;

import calculator.SampleUtils;

public class Identifier {

    private static double calcSkewness(double[] data, double mean, double stdDev){
        double cubedDiffSum = 0.0;
        for (double d : data) {
            cubedDiffSum += Math.pow(d - mean, 3);
        }

        return Math.sqrt(cubedDiffSum / (data.length * Math.pow(stdDev, 3)));
    }

    private static SkewType determineSkewType(double skewness){
        if(skewness < 0.5){
            return SkewType.NEGATIVE;
        }
        else if (skewness > 0.5){
            return SkewType.POSITIVE;
        }
        else{
            return SkewType.NORMAL;
        }
    }

    public static SkewType determineBasicDistType(double[] data){
        double mean = SampleUtils.meanFromVals(data);
        double stdDev = SampleUtils.sFromMean(data);

        double skewness = calcSkewness(data, mean, stdDev);

        return determineSkewType(skewness);
    }
}
