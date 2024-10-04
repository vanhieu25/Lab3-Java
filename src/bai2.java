import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//        Viết bảng cửu chương của 1 số nguyên bất kỳ
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen can lap bang cuu chuong");
        int n = sc.nextInt();
        for (int i= 1; i<=10;i++){
            System.out.println(n+" x "+ i+" = "+(n*i));
        }
    }
}
