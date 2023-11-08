package calculator;

/**
 * This class contains util functions to assist in handling sample data and interval calculations
 */
public class SampleUtils {

    /**
     * Calculates the mean value of a numerical sample
     * @param total the total of all the values in a sample
     * @param n the size of the sample
     * @return total / n (mean)
     */
    public static double meanFromTotal(int total, int n){
        return total / n;
    }

    /**
     * Calculates the standard deviation of a numerical sample
     * @param xVals contains all of the values for each item in the sample
     * @param n the size of the sample
     * @return statistical formula for calculating sample standard deviation
     */
    public static double sFromMean(int[] xVals, int n){

        //Calculates the sum of all X values
        double sumX = 0;
        for(double x : xVals){
            sumX += x;
        }

        //Calculates the sum of all X values squared
        double sumXSq = 0;
        for(double x : xVals){
            sumXSq += (x * x);
        }

        //Calculates and returns sample standard deviation
        return Math.sqrt((sumXSq - (sumX * sumX / n)) / (n-1)); 
    }
}
