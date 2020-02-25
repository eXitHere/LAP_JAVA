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
public class Student {
    private int studentID;
    private String name;
    private Course[] courseList = new Course[20];
    private int numCourse = 0;
    
    public Student(int nStudentID,String nName){
        this.studentID = nStudentID;
        this.name = nName;
    }
    
    public Student(){
        this(620000,"TEST");
    }
    
    public int getStudentID(){
        return this.studentID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addCourse(Course nCourse){
        this.courseList[this.numCourse] = nCourse;
        //nCourse.setName("TEST");
        //System.out.println(courseList[0].toString());
        //System.out.println("Add " + nCourse.getName() + " Complete!");
        //System.out.println(getCourseAll());
        this.numCourse++;
    }
    
    public void removeCourse(Course nCourse){
        int index = 0;
        for(int i=0;i<numCourse;i++){
            if(courseList[i].getName().compareTo(nCourse.getName()) == 0){
                courseList[index] = courseList[numCourse-1];
                courseList[numCourse-1] = null;
                this.numCourse--;
                //System.out.println("Remove " + courseList[i].getName() + " Complete!");
                //System.out.println(getCourseAll());
                break;
            }
            index++;
        }
    }
    
    public String getCourseAll(){
        String temp = "";   
        for(int i=0;i<numCourse;i++){
            //System.out.println(courseList[i].getName());
            if(i!=0) temp+= ",";
            temp+=courseList[i].getName();
        }
        //System.out.println("Inget !");
        return temp;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", courseList=" + getCourseAll() + ", numCourse=" + numCourse + '}';
    }
    
    
}
