/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thana
 */
public class Faculty extends Employee{
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        super();
        System.out.println("4. Faculty constructor invoked!");
    }
    
    
}

class Employee extends Person{

    public Employee() {
        this("2. Employee constructor invoked");
        System.out.println("3. Employee no-arg constructor invoked");
    }
    
    Employee(String s){
        super();
        System.out.println(s);
    }
}

class Person{
    Person(){
        System.out.println("1.Person contructor invoked");
    }
}
