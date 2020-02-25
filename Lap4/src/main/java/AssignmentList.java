/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
import java.util.ArrayList;
public class AssignmentList {
    private ArrayList<Assignment> itemList = new ArrayList<Assignment>();

    public void addItem(Assignment item){
        this.itemList.add(item);
    }
    
    public double computeCourseGrade(){
        if(this.itemList.size()==0) return 0;
        double Result=0;
        double Div=0;
        for (int i = 0; i < itemList.size(); i++) {
            /*System.out.println(String.format("%f %f %f",this.itemList.get(i).getTotalWeigth()
                    ,this.itemList.get(i).getScore(),this.itemList.get(i).getTotalPoint()));*/
            Result += ((this.itemList.get(i).getTotalWeigth()*
                    this.itemList.get(i).getScore())/
                    this.itemList.get(i).getTotalPoint());
            Div += this.itemList.get(i).getTotalWeigth();
        }
       // System.out.println(Result);
        //System.out.println(Div);
        return Result/Div;
    }
    
    public String toString(){
        String s="";
        for (int i = 0; i < this.itemList.size(); i++) {
            s+= this.itemList.get(i).toString() + "\n";
        }
        
        return s;
    }
}

