/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class RegularPolygon {
    private int n;
    private double s;
    private double x;
    private double y;
    
    RegularPolygon(){
        this(0,0.0,0.0,0.0);
    }
    
    RegularPolygon(int nn,double ns,double nx,double ny){
        this.n = nn;
        this.s = ns;
        this.x = nx;
        this.y = ny;
    }
    
    RegularPolygon(int nn,double ns){
        this.n = nn;
        this.s = ns;
    }
    
    public double getPerimeter(){
        return this.n * this.s;
    }
    
    public double getArea(){
        return (n*s*s)/(4*Math.tan(Math.PI/this.n));
    }
}
