package javacore.network;

import java.util.Scanner;

public class Bai4 {
    private static final int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap thang");
        String input = scanner.nextLine();
        try {
            int month = Integer.parseInt(input);
            if (month < 1 || month > 12) {
                System.out.println("Khong co thang nay");
            } else {
                System.out.println("Thang " + month + " co " + months[month - 1] + " ngay.");
            }
        } catch (Exception e) {
            System.out.println("Phai nhap so");
        }
        scanner.close();
        System.out.println("Ket thuc chuong trinh");
    }
}
