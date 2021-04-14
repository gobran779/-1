/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Student.Student;
import Utilty.CircularlyLinkedList;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class StudentControl {
    // deeclare the list and thr scanner 
    CircularlyLinkedList<Student> list=new CircularlyLinkedList<>();
    Scanner input =new Scanner(System.in);
    
    
    //function to add patient to the list 
      public void addStudent()
    {
        Student s=new Student();
        System.out.println("enter the student's id pls:");
       s.setId(input.nextInt());
       System.out.println("enter the student's name pls:");
       s.setName(input.nextLine());
       s.setName(input.nextLine());
       System.out.println("enter the student's address pls:");
       s.setAddress(input.nextLine());
       
       list.addLast(s);
       
      
    }
      
      //function to remove the specific patient by his/her id
      
        public void removeStudent(int id)
    {
        if(nuberOfStudent()>0){
        boolean check=false;
        while(!check)
        {
            if(list.first().getId()==id)
            {
                check=true;
                list.removeFirst();
                System.out.println("the data is deleted successfully ");
                 return ;
            }else 
            {
                list.rotate();
            }
            
        }
        if(!check )
            {
                System.out.println("the data is not exit ");
            }
    }else{
            System.out.println("there is no data");}
       
      
    }
        
        //function to get the size of the list
      public int nuberOfStudent()
    {
        return list.size();
    }
      
      //function to print the specific patient by his/her id
      
        public void printStudent(int id)
    {
        if(nuberOfStudent()>0){
        boolean check=false;
        while(!check)
        {
            if(list.first().getId()==id)
            {
                check=true;
                System.out.println(list.first().toString());
                System.out.println("the data is deleted successfully ");
                 return ;
            }else 
            {
                list.rotate();
            }
            
        }
        if(!check )
            {
                System.out.println("the data is not exit ");
            }
    }else{
            System.out.println("there is no data");}
       
      
    }
      
      // function to print all the data in the list 
       public void printStudentall()
       {
        
           
           int n=nuberOfStudent();
           if(nuberOfStudent() >0)
           {
           for (int i = 0; i <n ; i++)
           {
               list.first().toString();
               list.rotate();
           }
       }else
          {
              System.out.println("there is no data");
          }
       }
      
}
