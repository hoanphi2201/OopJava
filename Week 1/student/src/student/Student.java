/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

//import java.security.acl.Group;

/**
 *
 * @author phixuanhoan
 */
public class Student {
    // name  : tên sinh viên
    private String name;
    // id    : mã số sinh viên 
    private String id;
    // group : lớp học
    private String group;
    // email : địa chỉ email
    private String email;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    // getInfo : in ra toàn bộ thông tin của sinh viên
    public String getInfo(){
        String info = "";
        info += "\nTên sinh viên: " + name;
        info += "\nMã số sinh viên: " + id;
        info += "\nLớp học: " + group;
        info += "\nEmail: " + email;
        return info;
    }
    // Student() : hàm khởi tạo không tham số
    public Student(){
       name     = "Student";
       id       = "000";
       group    = "K59CB";
       email    = "uet@vnu.edu.vn";
    }
     // Student() : hàm khởi tạo có tham số(mặc định group)
    public Student(String n, String sid, String em){
       name     = n;
       id       = sid;
       group    = "K59CB";
       email    = em;
    }
    // student() : hàm khởi tạo có tham số
    public Student(String n, String sid, String gr, String em){
       name     = n;
       id       = sid;
       group    = gr;
       email    = em;
    }
    // Student() : hàm khởi tạo sao chép
    public Student(Student s){
       name     = s.name;
       id       = s.id;
       group    = s.group;
       email    = s.email;
    }
}

