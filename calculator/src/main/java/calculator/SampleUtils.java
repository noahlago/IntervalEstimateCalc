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
     * Calculates the mean from an array of sample values
     * @param x_vals array containing all of the values within the sample
     * @return sum of all sample values divided by number of sample values
     */
    public static double meanFromVals(double[] x_vals){
        double sum = 0;
        for(double x : x_vals){
            sum += x;
        }

        return sum / x_vals.length;
    }

    /**
     * Calculates the standard deviation of a numerical sample
     * @param xVals contains all of the values for each item in the sample
     * @param n the size of the sample
     * @return statistical formula for calculating sample standard deviation
     */
    public static double sFromMean(double[] xVals, int n){

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
