/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Student;
import Utilty.Person;
/**
 *
 * @author Ali
 */
public class Student extends Person {

    public Student() {
    }

    public Student(int id, String name, String address) {
        super(id, name, address);
    }

      @Override
       public String toString() 
       {
           System.out.println( super.toString());
           return null;
       }

   
    
    
    
  
    
}
