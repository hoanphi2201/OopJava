/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.security.acl.Group;

/**
 *
 * @author phixuanhoan
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    
    /**
     * @param args the command line arguments
     */
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(String ID){
        id = ID;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String g){
        group = g;
    }
    public String getGroup(){
        return group;
    }
     public void setEmail(String em){
        email = em;
    }
    public String getEmail(){
        return email;
    }
    
    public Student(String n, String ID, String g, String Email){
        name = n;
        id = ID;
        group = g;
        email = Email;
    }
    public Student(){
        name = "student";
        id = "000";
        group = "INT2204";
        email = "uet@vnu.edu.vn";
    }
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    public void getInfo(){
        System.out.println("Họ tên: " + name);
        System.out.println("ID: " + id );
        System.out.println("Group: " + group);
        System.out.println("Email: " +email); 
    }
   
}

