/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author test
 */
public class Student {

    private int ID;
    private String astaad;
   
    

    /**
     * Get the value of ID
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }
    private String phone;

    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the value of phone
     *
     * @param phone new value of phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    /**
     * Set the value of ID
     *
     * @param ID new value of ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
   

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
