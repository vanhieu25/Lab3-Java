import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
//    Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//    nguyên tố hay không ?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isPrime = 1;
        System.out.println("Nhap vao so nguyen can kiem tra ");
        int n = sc.nextInt();
        if (n <= 1){
            isPrime = 0;
        } else if (n <= 3) {
            isPrime =  1;
        } else if (n%2 ==0 || n%3 == 0) {
            isPrime =0;
        }
        else {
            for (int i =5; i*i <= n; i+=6){
                if (n % i == 0 || n % (i+2) ==0 ){
                    isPrime =0;
                    break;
                }
            }
        }
        if (isPrime ==1){
            System.out.println(n + " la so nguyen to ");
        }
        else {
            System.out.println(n+" khong phai la so nguyen to ");
        }
    }
}
