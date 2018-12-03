package week12;

import java.util.ArrayList;

public class Person {

    protected String HoTen;
    protected int NgaySinh;
    protected int ThangSinh;
    protected int NamSinh;
    protected String GioiTinh;
    protected boolean KetHon;
    ArrayList<Person> Con;

    public Person(String hoten, int ngay, int thang, int nam, String gt, boolean kh) {
        this.HoTen = hoten;
        this.NgaySinh = ngay;
        this.ThangSinh = thang;
        this.NamSinh = nam;
        this.GioiTinh = gt;
        this.KetHon = kh;
        Con = new ArrayList<>();
    }

    public void add(Person p) {
        Con.add(p);
    }

    public void remove(Person p) {
        Con.remove(p);
    }

    public ArrayList<Person> getCon() {
        return Con;
    }

    public String toString() {
        return ("Persion :[ Họ Tên: " + HoTen + " - Sinh Ngày: " + NgaySinh + "/" + ThangSinh + "/" + NamSinh + " - GT: " + GioiTinh + " ]");
    }

    public static void main(String[] args) {
        ArrayList<Person> phahe = new ArrayList<>();
        Person X = new Person("X", 22, 1, 1999, "Nam", true);
        phahe.add(X);
        Person Y = new Person("Y", 25, 8, 1999, "Nữ", true);
        phahe.add(Y);
        Person A = new Person("A", 23, 1, 2016, "Nữ", true);
        phahe.add(A);
        X.add(A);
        Y.add(A);
        Person B = new Person("B", 1, 1, 2006, "Nam", false);
        phahe.add(B);
        Person C = new Person("C", 1, 1, 2018, "Nam", false);
        phahe.add(C);
        X.add(C);
        Y.add(C);
        for (int i = 0; i < phahe.size(); i++) {
            if (!phahe.get(i).KetHon) {
                System.out.println("- Không kết hôn - ");
                System.out.println(phahe.get(i).toString());
            }
            if (phahe.get(i).Con.size() == 2) {
                System.out.println("- Có 2 con - ");
                System.out.println(phahe.get(i).toString());
            }
        }
    }

}
