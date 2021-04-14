/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ali;

import java.util.LinkedList;
import java.util.Scanner;
import DataStuctureClasses.DoublyLinkedList;
import Teacher.Teacher;

/**
 *
 * @author Hesham
 */
public class TeacherControl {
   public   LinkedList<Teacher> list= new LinkedList<>();
   DoublyLinkedList link=new DoublyLinkedList<>();
   Scanner input =new Scanner(System.in);
    public void addTeacher()
    {
       Teacher t=new Teacher();
       System.out.println("enter the Teacher's id pls:");
       t.setId(input.nextInt());
       System.out.println("enter the Teacher's name pls:");
       t.setName(input.nextLine());
        t.setName(input.nextLine());
       System.out.println("enter the Teacher's address pls:");
       t.setAddress(input.nextLine());
       System.out.println("enter the Teacher's qualfication pls:");
       t.setQualfication(input.nextLine());
       System.out.println("enter the Teacher's hiredDate pls:");
       t.setHiredDate(input.nextLine());
       
        list.add(t);
        
    }
    
    
    public boolean removeTeacher(int id)
    {
        return true;
       
    }
    public int NuberOfTeacher()
    {
        return list.size();
    }
    public void PrintTeacher()
    {
       int n=NuberOfTeacher();
        for (int i = 0; i <n ; i++) {
            System.out.println(list.getFirst().toString());
            list.iterator();
        }
        
    }
    }

