/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    LinearEquation(){
        
    }
    
    LinearEquation(double A,double B,double C,double D,double E,double F){
        this.a = A;
        this.b = B;
        this.c = C;
        this.e = E;
        this.d = D;
        this.f = F;
    }
    
    public double getA(){return this.a;}
    public double getB(){return this.b;}
    public double getC(){return this.c;}
    public double getD(){return this.d;}
    public double getE(){return this.e;}
    public double getF(){return this.f;}
    
    public void setA(double A){this.a = A;}
    public void setB(double B){this.b = B;}
    public void setC(double C){this.c = C;}
    public void setD(double D){this.d = D;}
    public void setE(double E){this.e = E;}
    public void setF(double F){this.f = F;}
    
    public boolean isSolvable(){
        return Double.compare(a*d,b*c) != 0;
    }
    
    public double getX(){
        return (e*d - b*f) / (a*d-b*c);
    }
    
    public double getY(){
        return ((a*f-e*c)/(a*d-b*c));
    }
}
