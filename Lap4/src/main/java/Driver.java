/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Driver {
    public static void main(String[] args) {
        AssignmentList list = new AssignmentList();
        //Assignment A = new Assignment();
        Assignment Assi1 = new Assignment("Assignment1", 1, 10, 12, 12);
        Assi1.setScore(0.78);
        Assi1.setTotalPoint(0.99);
        Assi1.setTotalWeigth(0.30);
        
        Assignment Assi2 = new Assignment("Assignment 2", 3, 13, 11, 12);
        Assi2.setScore(0.78);
        Assi2.setTotalPoint(0.99);
        Assi2.setTotalWeigth(0.30);
        
        list.addItem(Assi1);
        //list.addItem(Assi2);
        
        Lab lab1 = new Lab("Lab1",1,2,3,4);
        lab1.setScore(0.78);
        lab1.setTotalPoint(0.99);
        lab1.setTotalWeigth(0.30);
        
        Project p1 = new Project("TEST.pdf","File.csv","Project",1,2,3,4);
        p1.setScore(0.78);
        p1.setTotalPoint(0.99);
        p1.setTotalWeigth(0.30);
        
        list.addItem(lab1);
        list.addItem(p1);
        System.out.println(list.toString());
        System.out.println(Assi1.toString());
        System.out.println(Assi2.toString());
        System.out.println(lab1.toString());
        System.out.println(p1.toString());
        System.out.println(list.computeCourseGrade());
    }
   
}
