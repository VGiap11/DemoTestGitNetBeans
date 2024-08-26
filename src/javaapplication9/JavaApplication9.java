/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaApplication9 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int SL = 0;
        System.out.print("Xin mời nhập số lượng sinh viên:");
        SL = scanner.nextInt();

        String[] ten = new String[SL];
        float[] diem = new float[SL];

        for (int i = 0; i < SL; i++) {
            System.out.printf("Nhập họ tên sinh viên thứ %d:" ,i + 1);
            scanner.nextLine();
            ten[i] = scanner.nextLine();
            System.out.printf("Nhập điểm của sinh viên thứ %d:", i + 1);
            diem[i] = scanner.nextFloat();
        }
        for (int i = 0; i < SL; i++) {
            // Xét học lực
            String hocLuc = "Kém";
            if (diem[i] < 5) {
                hocLuc = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc = "Trung bình";
            } else if (diem[i] < 7.5) {
                hocLuc = "Khá";
            } else if (diem[i] < 9) {
                hocLuc = "Giỏi";
            } else {
                hocLuc = "Xuất sắc";
            }
            // Xuất thông tin
            System.out.println("Họ tên: " + ten[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc); System.out.println("Học lực: " + hocLuc); System.out.println("Học lực: " + hocLuc);
             System.out.println("Học lực: " + hocLuc); System.out.println("Học lực: " + hocLuc);
        }

        // Sắp xếp danh sách sinh viên theo điểm giảm dần
        for (int i = 0; i < SL - 1; i++) {
            for (int j = i + 1; j < SL; j++) {
                if (diem[i] < diem[j]) { // Change the condition for descending order
                    float temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;

                    String tempTen = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempTen;
                }
            }
        }

        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < SL; i++) {
            // Xuất thông tin
            System.out.println("Họ tên: " + ten[i]);
            System.out.println("Điểm: " + diem[i]);
        }
    }
}
