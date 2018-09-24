package phanso;

/**
 * @author phixuanhoan
 */
public class PhanSo {
    //tuso : tử số 
    private int tuso;
    //mauso : mẫu số
    private int mauso;
    // Khởi tạo PhanSo có điều kiện mẫu số của 1 phân số luôn khác 0
    public PhanSo(int tu, int mau){
        this.tuso = tu;
        if(mau != 0){
            this.mauso = mau;
        }else{
            System.out.print("Khởi tạo không hợp lệ(mẫu số khác 0)");
            System.exit(0);
        }
        
    }
    //Tính tổng 2 phân số
    public PhanSo tongPhanSo(PhanSo ps){
        int tusoTong = this.tuso * ps.mauso + this.mauso * ps.tuso;
        int mausoTong = this.mauso * ps.mauso;
        PhanSo pstong = new PhanSo(tusoTong, mausoTong);
        pstong.ToiGianPhanSo();
        return pstong;
    }
    //Tính hiệu 2 phân số
    public PhanSo hieuPhanSo(PhanSo ps){
        int tmpTuSo = -1 * ps.tuso;
        PhanSo tmp = new PhanSo(tmpTuSo, ps.mauso);
        return this.tongPhanSo(tmp);
    }
    // Tính tích 2 phân số
    public PhanSo tichPhanSo(PhanSo ps){
        int tusoTich = this.tuso * ps.tuso;
        int mausoTich = this.mauso * ps.mauso;
        PhanSo psTich = new PhanSo(tusoTich, mausoTich);
        psTich.ToiGianPhanSo();
        return psTich;
    }
    // Tính thương 2 phân số
    public PhanSo thuongPhanSo(PhanSo ps){
        int tmpTu = ps.mauso;
        int tmpMau = ps.tuso;
        PhanSo nghichDao = new PhanSo(tmpTu, tmpMau);
        return this.tichPhanSo(nghichDao);
    }
    // So sánh 2 phân số
    public boolean equals(PhanSo ps){
        double ps1 = (double)this.tuso/this.mauso;
        double ps2 = (double)ps.tuso/ps.mauso;
        return ps1 == ps2;
    }
    // in ra 1 phân số 0/n = 0; n / 1 = n; 1/ 1 =1;
    public void outPutPS(){
        if(this.tuso == 0){
            System.out.println("Phan so: 0");
        }else if(this.tuso == 1 && this.mauso == 1){
            System.out.println("Phan so: 1");
        }else if(this.tuso != 1 && this.mauso == 1){
            System.out.println("Phan so: " + tuso);
        }else{
            System.out.println("Phan so: " + tuso + "\\"+mauso);
        }

    }
    // Tìm ước chung lớn nhất của 2 số
    public int GCD(int a, int b){
        if(a == 0 || b == 0){
            return 1;
        }
        a = a > 0 ? a : (a * -1);
        b = b > 0 ? b : (b * -1);
         while (a != b) {            
            if(a > b){
                a = a -b;
            }
            if( b > a){
                b = b - a;
            }
        }
        return a;
    }
    //Tối giản phân số
    public void ToiGianPhanSo(){
        int gcd = GCD(this.tuso, this.mauso);
        this.tuso = this.tuso / gcd;
        this.mauso = this.mauso / gcd;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2, 4);
        PhanSo ps2 = new PhanSo(1, 2);
        
        PhanSo psTong =  ps1.tongPhanSo(ps2);
        psTong.outPutPS();
        
        PhanSo psHieu = ps1.hieuPhanSo(ps2);
        psHieu.outPutPS();
        
        PhanSo psTich = ps1.tichPhanSo(ps2);
        psTich.outPutPS();
        
        PhanSo psThuong = ps1.thuongPhanSo(ps2);
        psThuong.outPutPS();
        
        System.out.print(ps1.equals(ps2));
        
    }
    
}
