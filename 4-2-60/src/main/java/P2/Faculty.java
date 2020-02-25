/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author Thana
 */
public class Faculty {
    private Course[] courseList= new Course[10];
    private int countCourse = 0;
    private String name;
    
    public Faculty(String n){
        name = n;
    }
    
    public void addCourse(Course n){
        courseList[countCourse] = n;
        countCourse++;
    }
    
    public String getName(){
        return name;
    }
}
