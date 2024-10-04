import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
//        Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//        - Sắp xếp và xuất mảng vừa nhập ra màn hình
//                - Xuất phần tử có giá trị nhỏ nhất
//                - Xuất phần tử có giá trị lớn nhất
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int size = sc.nextInt();
        int[] n = new int[size ];
        for (int i=0; i < size;i++){
            System.out.println("Nhap vao phan tu thu " + (i+1) +" cua mang: ");
                n[i] = sc.nextInt();
        }
        System.out.println("Mang da nhap la: "+ Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("Mang sau khi sap xep la: "+ Arrays.toString(n));
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            max = Math.max(max, n[i]);
        }

        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            min = Math.min(min, n[i]);
        }
        System.out.println("Phan tu lon nhat cua mang la " + max);
        System.out.println("Phan tu nho nhat cua mang la " + min);
    }

}

