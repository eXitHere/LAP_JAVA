
package P2;


public class Course {
    private String CouresName;
    private Student[] studentsList = new Student[100];
    private Faculty[] facultyList = new Faculty[3];
    private int numberOfStudents = 0;
    private int numberOfFaculty = 0;

    
    public Course(String N){
        this.CouresName = N;
    }

    @Override
    public String toString() {
        return "Course{" + "CouresName=" + CouresName + ", studentsList=" + getStudents() + ", facultyList=" + getFaculty() + ", numberOfStudents=" + numberOfStudents + ", numberOfFaculty=" + numberOfFaculty + '}';
    }
    
    public String getCouresName(){
        return this.CouresName;
    }
    
    public void addFaculty(Faculty N){
        facultyList[numberOfFaculty] = N;
        numberOfFaculty++;
    }
    
    public void addStudent(Student N){
        this.studentsList[numberOfStudents] = N;
        this.numberOfStudents++;
    }
    
    public void clear(){
        for (int i = 0; i < numberOfStudents; i++) {
            this.studentsList[i]=null;
        }
        this.numberOfStudents =0;
    }
    
    public void dropStudent(String D){
        int temp =-1;
        for (int i = 0; i < numberOfStudents; i++) {
            if(studentsList[i].getName().compareTo(D)==0){
                temp = i;
                break;
            }
        }
        if(temp != -1){
            this.studentsList[temp] = this.studentsList[numberOfStudents-1];
            this.studentsList[numberOfStudents-1]=null;
            this.numberOfStudents--;
        }
        
    }
    
    public String getStudents(){
        String s = "";
        for (int i = 0; i < numberOfStudents; i++) {
            if(i!=0) s+=",";
            s += studentsList[i].getName(); 
        }
        return s;
    }
    
    public String getFaculty(){
        String s = "";
        for (int i = 0; i < numberOfFaculty; i++) {
            if(i!=0) s+=",";
            s += facultyList[i].getName(); 
        }
        return s;
    }

    
    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
}

