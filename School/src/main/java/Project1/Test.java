/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;
import java.util.Scanner;
/**
 *
 * @author Thana
 */
public class Test {
    public static void main(String[] args) {
        System.out.println();
        int Menu=0;
        Scanner IN = new Scanner(System.in);
        Student A = new Student(62010381,"THANA");
        Student B = new Student(62010382,"AAAAA");
        Student C = new Student(62010383,"CCCCC");
        Faculty T1 = new Faculty("TH1");
        Faculty T2 = new Faculty("TH2");
        Course C1 = new Course("CCCC1");
        Course C2 = new Course("CCCC2");
        A.addCourse(C1);
        A.addCourse(C2);
        //C1.setName("AA");
        System.out.println(C1.getName());
        System.out.println(A.toString());
        A.removeCourse(C2);
        System.out.println(A.toString());
    }
}
