package calculator;

public abstract class Distribution {
    private double popDev;
    private double popMean;
    private double sampleDev;
    private double sampleMean;
    private int n;

    //Return population standard deviation
    public double getPopDev(){
        return this.popDev;
    }

    //Return population mean/true mean
    public double getPopMean(){
        return this.popMean;
    }

    //Return sample standard deviation
    public double getSampleDev(){
        return this.sampleDev;
    }

    //Return sample mean
    public double getSampleMean(){
        return this.sampleMean;
    }

    //Return this sample's size
    public int getN(){
        return this.n;
    }

    //Set sample size (N)
    public void setN(int n){
        this.n = n;
    }

    //Set sample standard deviation
    public void setSampleDev(double dev){
        this.sampleDev = dev;
    }

    //Set sample mean
    public void setSampleMean(double mean){
        this.sampleMean = mean;
    }

    //Set population standard deviation
    public void setPopDev(double dev){
        this.popDev = dev;
    }

    //Set population mean/true mean
    public void setPopMean(double mean){
        this.popMean = mean;
    }

    //Uses the inputted values for the sample to calculate the population mean
    public abstract boolean calcPopMean();

    //Uses the inputted values for the sample to calculate the population standard deviation
    public abstract boolean calcPopDev();

}
