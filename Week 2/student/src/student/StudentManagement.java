/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author phixuanhoan
 */
public class StudentManagement {
    public static List<Student> listStudent = new ArrayList<Student>();
    private int total;
    public static Scanner scan = new Scanner(System.in);
    public static boolean  sameGroup(Student s1,Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public void inputGroupStudent(int n){
        for(int i = 0; i < n ; i++){
            //scan.nextLine();
            System.out.println("Enter name: ");
            scan.nextLine();
            String name = scan.nextLine();
            
            System.out.println("Enter ID: ");
            String id = scan.nextLine();
            
            System.out.println("Enter group: ");
            String group = scan.nextLine();
            
            System.out.println("Enter email: ");
            String email = scan.nextLine();
            
            Student tmp = new Student(name, id, group, email);
            
            listStudent.add(tmp);
           
        }
    }
    public void outputGroupStudent(){
        int n  = listStudent.size();
        for(int i = 0; i < n ; i++){
            System.out.println("Name: " + listStudent.get(i).getName());
            System.out.println("ID: " + listStudent.get(i).getId());
            System.out.println("Group: " + listStudent.get(i).getGroup());
            System.out.println("Email: " + listStudent.get(i).getEmail());

            
        }
    }
    public static boolean checkSame(Student s, int e){
        for(int i = 0; i < e; i ++){
            if(sameGroup(s, listStudent.get(i))){
                return true;
            }
        }
        return false;
    }
    public void studentsByGroup(){
        int numGroup = listStudent.size();
        for(int i = 0; i < numGroup; i++){
            System.out.print(checkSame(listStudent.get(i), i));
            if(checkSame(listStudent.get(i), i) == false){
                System.out.println(" === Lớp " + listStudent.get(i).getGroup() + " ===");
                for(int j = i; j < numGroup; j++){
                    if(sameGroup(listStudent.get(i), listStudent.get(j))){
                        listStudent.get(j).getInfo();
                    }
                }
            }
        }
    }
    public void removeStudent(String id){
        for(int i = 0; i < listStudent.size();){
            if(listStudent.get(i).getId().equals(id)){
                listStudent.remove(i);
            }else{
                i++;
            }
        }
     
    }
    public static void main(String[] args) {
//        Student s1 = new Student("Phi Xuan Hoan","17020759","CQ-CL","17020759@vnu.edu.vn");
//        Student s2 = new Student("Le Cong Ky","17020569","CQ-CL","17020569@vnu.edu.vn");
//       
//        s1.getInfo();
//        s2.getInfo();
        
        StudentManagement sm = new StudentManagement();
//        boolean check= sm.sameGroup(s1, s2);
//        //System.out.print(check);
//        
//        if(check == true){
//            System.out.print("same Group");
//        }else{
//            System.out.print("not Same Group");
//        }
        int n;
        System.out.print("Enter the number of group: " );
        n = scan.nextInt();
        sm.inputGroupStudent(n);
        //sm.outputGroupStudent();
        sm.studentsByGroup();
        //String idx = "2";
        
//        sm.removeStudent(idx);
//        sm.outputGroupStudent();
    }
}
