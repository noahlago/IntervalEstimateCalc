package calculator;

public interface Distribution {

    //Calculate population standard deviation
    public double popDev();

    //Calculate population mean/true mean
    public double popMean();

    //Calculate sample standard deviation
    public double sampleDev();

    //Calculate sample mean
    public double sampleMean();

    //Set sample size (N)
    public void setN(int n);

    //Set sample standard deviation
    public void setSampleDev(double dev);

    //Set sample mean
    public void setSampleMean(double mean);

    //Set population standard deviation
    public void setPopDev(double dev);

    //Set population mean/true mean
    public void setPopMean(double mean);

}
