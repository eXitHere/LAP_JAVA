/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;
import java.util.Scanner;
/**
 *
 * @author Thana
 */
public class test {
    
        
    public static void main(String[] args) {

        Course c1 = new Course("EIEI");
        c1.addFaculty(new Faculty("SomChat"));
        Scanner I = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 ADD, 2 DROP : ");
            int choice = I.nextInt();
            if(choice == 1){
                System.out.println("[ADD] Enter name : ");
                c1.addStudent(new Student(I.next()));
                System.out.println(c1.toString());
            }
            else if(choice == 2){
                System.out.println("[DROP] Enter name : ");
                c1.dropStudent(I.next());
                System.out.println(c1.toString());
            }
            else if(choice ==3)
            {
                return ;
            }
        }
   
    }
}
