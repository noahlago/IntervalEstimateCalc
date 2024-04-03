package calculator;

public abstract class Distribution {
    private double popDev;
    private double popMean;
    private double sampleDev;
    private double sampleMean;
    private int n;

    //Calculate population standard deviation
    public abstract double popDev();

    //Calculate population mean/true mean
    public abstract double popMean();

    //Calculate sample standard deviation
    public abstract double sampleDev();

    //Calculate sample mean
    public abstract double sampleMean();

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

}
