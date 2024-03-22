package calculator.Distributions;

import calculator.Distribution;

public class PoissonDistribution implements Distribution{

    private int n;
    private double sampleDev;
    private double sampleMean;
    private double popDev;
    private double popMean;

    public PoissonDistribution(int n){
        this.n = n;
    }

    @Override
    public double popDev() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'popDev'");
    }

    @Override
    public double popMean() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'popMean'");
    }

    @Override
    public double sampleDev() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sampledev'");
    }

    @Override
    public double sampleMean() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'samplemean'");
    }

    @Override
    public void setN(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setN'");
    }

    @Override
    public void setSampleDev(double dev) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSampleDev'");
    }

    @Override
    public void setSampleMean(double mean) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSampleMean'");
    }

    @Override
    public void setPopDev(double dev) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPopDev'");
    }

    @Override
    public void setPopMean(double mean){
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPopDev'");
    }

    public int getN() {
        return n;
    }

    public double getPopDev() {
        return popDev;
    }

    public double getPopMean() {
        return popMean;
    }

    public double getSampleDev() {
        return sampleDev;
    }

    public double getSampleMean() {
        return sampleMean;
    }
    
}
