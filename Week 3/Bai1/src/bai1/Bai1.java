package bai1;
/**
 * @author phixuanhoan
 */
public class Bai1 {
    //Hàm tìm ước chung lớn nhất của 2 số
    public int GCD(int a, int b) {
        if(a == 0 || b == 0) {
            return (a>=b) ? a : b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
        }
        return a;
    }
    //Hàm tìm fibonaxi của 1 số n
    public String sumTownNumber(String s1, String s2) {
	int lenght_s1 = s1.length();
	int lenght_s2 = s2.length();
	int Min = lenght_s1 < lenght_s2 ? lenght_s1 : lenght_s2;
	int Max = lenght_s1 > lenght_s2 ? lenght_s1 : lenght_s2;
	if ( Min == lenght_s1) {
		for(int i = 1; i <= Max- Min; i++ ) {
                    s1 = "0" + s1;
		}
        }
	else if( Min == lenght_s2) {
		for(int i = 1; i <= Max- Min; i++ ) {
                    s2 = "0" + s2;
		}
	}
        int[] ketqua  = new int[100000];
        int length_ketqua = 0;
	int idx = 0;
	int nho = 0;
	for( int i = Max-1; i>=0; i--) {
            int so = (s1.charAt(i)-48) + (s2.charAt(i)-48)+nho;
            //Khi cộng mảng này chương trình sẽ hiểu nhầm là cộng chuỗi nên phải  - 48
            //System.out.println(s1.charAt(i) + " - " + s2.charAt(i));
            nho =so/10;
            so %=10;
            ketqua[idx++] = so+48;
            length_ketqua++;
	}
	if(nho != 0){
            ketqua[idx++] = nho+48;
            length_ketqua++;    
	}
        String kq = "";
        for(int i = length_ketqua - 1; i >= 0; i--) {
            kq = kq + (ketqua[i]-48);
        }
        return kq;
    }
    public String fibonaxi(int n) {
        String[] arr = new String[100000];
        arr[0] = "0";
        arr[1] = "1";
        for (int i = 2; i <= n; i++) {
            arr[i] = sumTownNumber(arr[i-1], arr[i-2]);
        }
        return arr[n];
     
    }
    public int fibonaxi_thuong(int n) {
        int[] arr = new int[100000];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
     
    }
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        System.out.println(bai1.GCD(0,5));
        System.out.println(bai1.fibonaxi(10000)); 
        
    }
    

}
