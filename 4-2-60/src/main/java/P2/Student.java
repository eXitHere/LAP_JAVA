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
public class Student {
    private Course[] courseList = new Course[10];
    String name;
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public Student(String n){
        name = n;
    }
    
    private int countCoures = 0;
    public void addCoures(Course n){
        courseList[countCoures] = n;
        countCoures++;
    }
}
