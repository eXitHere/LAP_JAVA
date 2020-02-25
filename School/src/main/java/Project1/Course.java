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
public class Course {
    private String name;
    private Student[] studentList = new Student[30];
    private Faculty[] facultyList = new Faculty[2];
    private int numStudent = 0;
    private int numFaculty = 0;
    public Course(String nName){
        this.name = nName;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", studentList=" + getStudentAll() + ", facultyList=" + getFacultyAll() + ", numStudent=" + numStudent + ", numFaculty=" + numFaculty + '}';
    }
    
    public Course(){
        this("None");
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addStudent(Student nStudent){
        this.studentList[this.numStudent] = nStudent;
        this.numStudent++;
        System.out.println(getStudentAll());
    }
    
    public void removeStudent(Student nStudent){
        int index =0;
        for(int i=0;i<numStudent;i++){
            if(studentList[i].getStudentID() == nStudent.getStudentID()){
                System.out.println("Remove " + studentList[i].getStudentID() + " Complete!");
                this.studentList[index] = this.studentList[this.numStudent];
                this.studentList[this.numStudent] = null;
                this.numStudent--;
                System.out.println(getStudentAll());
            }
            index++;
        }
    }
    
    public String getStudentAll(){
        String temp = "";
        for(int i=0;i<numStudent;i++){
            if(i!=0) temp+= ",";
            temp += Integer.toString(studentList[i].getStudentID())+ " " + studentList[i].getName() ;
        }
        return temp;
    }
    
    public void addFaculty(Faculty nFaculty){
        this.facultyList[this.numFaculty] = nFaculty;
        this.numFaculty++;
        System.out.println(getFacultyAll());
    }
    
    public void removeStudent(Faculty nStudent){
        int index =0;
        for(int i=0;i<numFaculty;i++){
            if(facultyList[i].getName().compareTo(nStudent.getName())==0){
                System.out.println("Remove " + facultyList[i].getName() + " Complete!");
                this.facultyList[index] = this.facultyList[this.numStudent];
                this.facultyList[this.numFaculty] = null;
                this.numFaculty--;
                System.out.println(getFacultyAll());
            }
            index++;
        }
    }
    
    public String getFacultyAll(){
        String temp = "";
        for(int i=0;i<numFaculty;i++){
            if(i!=0) temp+= ",";
            temp += facultyList[i].getName();
        }
        return temp;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    
}
