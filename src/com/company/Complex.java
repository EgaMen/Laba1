package com.company;

public class Complex {
    private double mReal;
    private double mImage;

    public Complex(){

    }
    public Complex(double a, double b){
        this.mReal=a;
        this.mImage=b;
    }

    public Complex sum(Complex b) {
        double mRealResult=mReal+b.getReal();
        double mImageResult=mImage+b.getImage();
        return new Complex(mRealResult, mImageResult);
    }

    public Complex difference(Complex b) {
        double mRealResult=mReal-b.getReal();
        double mImageResult=mImage-b.getImage();
        return new Complex(mRealResult, mImageResult);
    }

    public double module() {

        return Math.hypot(mReal,mImage);
    }
    public double argument(){
        if(mReal>0)
        {
            return Math.atan(mImage/mReal);
        }
        else if(mReal<0 & mImage>0)
        {
            return Math.PI+Math.atan(mImage/mReal);
        }
        else
        {
            return Math.PI+Math.atan(mImage/mReal);
        }
    }

    public double getReal() {
        return mReal;
    }

    public void setReal(double real) {
        mReal = real;
    }

    public double getImage() {
        return mImage;
    }

    public void setImage(double image) {
        mImage = image;
    }

    @Override
    public boolean equals(Object o) {
        if(o==this){
            return true;
        }
        if(o==null||o.getClass()!=this.getClass())
        {
            return false;
        }
        Complex a=(Complex)o;
        if(a.getReal()==this.mReal&&a.getImage()==this.getImage())
        {
            return true;
        }
        return false;
    }
}
