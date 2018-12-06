package be.vives.oop.complex;

/**
 * Complex
 */
public class Complex {
    private double real = 0;
    private double imaginary = 0;
    public Complex (double real , double imaginary){
    setReal (real);
    setImaginary(imaginary);   
}
    public void setReal (double real){
        this.real = real;
    }
    public double getReal(){
        return real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }
   
     public Complex add(Complex second){
        Complex result = new Complex();
        result.setReal (this.getReal()+second.getReal());
        result.setImaginary(this.getImaginary()+second.getImaginary());
        return result;
    }
     public Complex subtract(Complex second){
        Complex result = new Complex();
        result.setReal (this.getReal()-second.getReal());
        result.setImaginary(this.getImaginary()-second.getImaginary());
        return result;
    }
    public Complex multiply (Complex second){
        Complex result = new Complex();
        result.setReal (this.getReal()*second.getReal());
        result.setImaginary(this.getImaginary()*second.getImaginary());
        return result;
    }
    public Complex divide (double factor){
        Complex result = new Complex();
        result.setReal (this.getReal()/factor);
        result.setImaginary(this.getImaginary()/factor);
        return result;
    }
    public Complex(){
        this (0,0);
    }
    public Complex getCopy(){
        return new Complex (getReal(), getImaginary());
    }
    public Complex (Complex original){
        this (original.getReal(),original.getImaginary());
    }
    @Override
    public String toString(){
        return "("+getReal()+" + "+getImaginary()+"j"+")";
    }
}