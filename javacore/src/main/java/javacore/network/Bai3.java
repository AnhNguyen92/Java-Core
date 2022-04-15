package javacore.network;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so a");
        String inputA = scanner.nextLine();
        System.out.println("Moi nhap so b");
        String inputB = scanner.nextLine();
        try {
            int a = Integer.parseInt(inputA);
            int b = Integer.parseInt(inputB);
            System.out.println("Tong hai so la:");
            System.out.println(a + " + " + b + " = " + (a + b));
        } catch (Exception e) {
            System.out.println("Du lieu nhap vao khong dung");
        }
        scanner.close();
    }
}
