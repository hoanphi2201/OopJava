/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 * @author phixuanhoan
 * Note :Vì == là so sánh địa chỉ 2 đối tượng, 
 * còn equals là so sánh giá trị, nên trong trường hợp dưới đây dùng == sẽ không đúng.
 * Ví dụ so sánh String str = new String("123") và 123
 */
public class StudentManagement {
    public Scanner scan = new Scanner(System.in);
    // Mảng sinh viên max = 100
    public Student arrStudent[] = new Student[100];
    // numOfArrStudent lưu tổng số sinh viên
    public int numOfArrStudent = 0;
    // phương thức sameGroup kiểm tra 2 sinh viên cùng lớp 
    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    // phương thức checkSameBefore để kiểm tra xem trong
    // khoảng 0 - e có phần tử nào có group = val
    public boolean checkSameBefore(Student s, int end){
        for(int i = 0; i < end; i ++){
            if(sameGroup(s, arrStudent[i])){
                return true;
            }
        }
        return false;
    }
    // phương thức studentsByGroup in sinh viên theo lớp
    public void studentsByGroup(){
        for(int i = 0; i < numOfArrStudent; i++){
            if(checkSameBefore(arrStudent[i], i) == false){
                System.out.println(" ===== Lớp " + arrStudent[i].getGroup() + " =====");
                for(int j = i; j < numOfArrStudent; j++){
                    if(sameGroup(arrStudent[i], arrStudent[j])){
                        System.out.println(arrStudent[i].getInfo());
                    }
                }
            }
        }
    }
    
    //isExistID: Trả về vị trí xuất hiện của 1 id
    public int isExistID(String id){
        for(int i = 0; i < numOfArrStudent; i++){
            if(arrStudent[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    // removeStudent: xoá 1 sinh viên có id
    public void removeStudent(String id){
        int index = isExistID(id);
        if(index < 0){
            System.out.println("id không tồn tại");
        }else{
            for(int i = index; i < numOfArrStudent - 1; i++){
                arrStudent[i] = arrStudent[i+1];
            }
            numOfArrStudent = numOfArrStudent -1;
        }
        
    }
    public void input(){
    int luachon;

    do{
	System.out.print("\n--------------- Menu ---------------\n");
        System.out.print("\n1. Nhap sinh vien");
        System.out.print("\n2. Thoat");
        System.out.print("\n------------------------------------\n");
	do{
            System.out.print("\nNhap vao lua chon: ");
            luachon = scan.nextInt();
            if(luachon != 1 && luachon != 2){
                    System.out.print("\nLua chon khong hop le. Xin kiem tra lai !");
            }
        }while(luachon != 1 && luachon != 2);
            if(luachon == 1){   
                System.out.print("Enter name: ");
                scan.nextLine();
                String name = scan.nextLine();
		String id;
		boolean Check;
		do{
                    System.out.print("Enter ID: ");
                    id = scan.nextLine();
                    Check = true; // Khởi tạo ban đầu
                    for(int i = 0; i < numOfArrStudent; i++){
                        if(arrStudent[i].getId().equals(id)){
                            Check = false;
                            break;
                        }
                    }
                    if(Check == false){   
                        System.out.print("\nMa so sinh vien da bi trung. Xin kiem tra lai !");
                    }
		}while(Check == false); 
                    System.out.print("Enter group: ");
                    String group = scan.nextLine();
            
                    System.out.print("Enter email: ");
                    String email = scan.nextLine();
            
                    arrStudent[numOfArrStudent] = new Student(name, id, group, email);
                    numOfArrStudent++;	
            }

	}while(luachon != 2);
    }
    // inputStudent: Nhập liệu
    public void inputStudent(int n){
        numOfArrStudent = n;
        for( int i = 0; i < n; i++ ) {
            System.out.println("Nhập thông tin sinh viên : "+ (i + 1));
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            
            System.out.print("Enter ID: ");
            String id = scan.nextLine();
            
            System.out.print("Enter group: ");
            String group = scan.nextLine();
            
            System.out.print("Enter email: ");
            String email = scan.nextLine();
            
            arrStudent[i] = new Student(name, id, group, email);
        }
    }
    // Xuất dữ liệu
    public void outputStudent(){
        for(int i = 0; i < numOfArrStudent; i++){
            System.out.print(arrStudent[i].getInfo()); 
        }
    }
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        //  Ý 6
        Student student = new Student();
        student.setName("Phí Xuân Hoàn");
        student.setId("17020759");
        student.setGroup("2017-CQ-CL");
        student.setEmail("17020759@gmail.com");
        
        System.out.println("Tên sinh viên: " + student.getName());
        System.out.println(student.getInfo());
        
        //  Ý 8
        /*Student student1 = new Student();
        System.out.println(student1.getInfo());*/
        
        /*Student student2 = new Student("Phí Xuân Hoàn", "17020759", "17020759@vnu.edu.vn");
        System.out.println(student2.getInfo());
        
        Student student3 = new Student(student2);
        System.out.println(student3.getInfo());*/
        
        // Ý 10
        /*Student s1 = new Student();
        s1.setGroup("K59CLC");
        Student s2 = new Student();
        s2.setGroup("K59CLC");
        Student s3 = new Student();
        s3.setGroup("K58CB");
        System.out.println(studentManagement.sameGroup(s2,s3));*/
        
        
        studentManagement.input();
        //studentManagement.studentsByGroup();
        studentManagement.removeStudent("4");
       studentManagement.outputStudent();
        
    }
}
