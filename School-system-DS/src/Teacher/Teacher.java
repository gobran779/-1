/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;
import Person.Person;
/**
 *
 * @author Ali
 */

public class Teacher extends Person{
   
    private String qualfication;
    private String hiredDate;
    private int id;
    private String name;
    private String address;
    public Teacher() {
        super();
    }

    public Teacher(String qualfication, String hiredDate, int id, String name, String address) {
        this.qualfication = qualfication;
        this.hiredDate = hiredDate;
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getQualfication() {
        return qualfication;
    }

    public void setQualfication(String qualfication) {
        this.qualfication = qualfication;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        System.out.println( super.toString());
        return "qualfication=" + qualfication + ", hiredDate=" + hiredDate ;
    }

   

   

   
    
    
    
}
