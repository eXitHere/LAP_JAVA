/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author Thana
 */
public class Faculty {
    private String name;
    private Course[] courseList = new Course[5];
    private int numCourse = 0;
    
    public Faculty(String nName){
        this.name = nName;
    }
    
    public Faculty(){
        this("None name Faculty");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addCourse(Course nCourse){
        this.courseList[this.numCourse] = nCourse;
        System.out.println("Add " + nCourse.getName() + " Complete!");
        System.out.println(getCourseAll());
        this.numCourse++;
    }
    
    public void removeCourse(Course nCourse){
        int index = 0;
        for(int i=0;i<numCourse;i++){
            if(courseList[i].getName().compareTo(nCourse.getName()) == 0){
                courseList[index] = courseList[numCourse-1];
                courseList[numCourse-1] = null;
                this.numCourse--;
                System.out.println("Remove " + courseList[i].getName() + " Complete!");
                System.out.println(getCourseAll());
                break;
            }
            index++;
        }
    }
    
    public String getCourseAll(){
        String temp = "";
        for(int i=0;i<numCourse;i++){
             if(i!=0) temp+= ",";
            temp+=courseList[i].getName();
        }
        return temp;
    }
}
