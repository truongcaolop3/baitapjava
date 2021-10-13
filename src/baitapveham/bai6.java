/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapveham;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai6 {
    public static void ptbac1(float a,float b) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tham so a va b:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        x = -b/a;
        System.out.println("phuong trinh " + a + "x" +" + "+ b + " = " );
        System.out.println("x = "+ x);
    }
    public static void ptbac2(float a, float b, float c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        a = sc.nextFloat();
        System.out.println("nhập b: ");
        b = sc.nextFloat();
        System.out.println("nhập c: ");
        c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    public static void hamchon() {
        float a = 0 , b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        String q = "";
        System.out.println("nhập chọn giải ptbac1 hay ptbac2: ");
        System.out.println("2 cách nhập:");
        System.out.println("1: giải phương trình bậc 1");
        System.out.println("2: giải phương trình bậc 2");
        q = sc.next();
        switch (q){
            case "1" :
                ptbac1(a, b);
            case "2":
                ptbac2(a, b, c);
            default: 
                System.out.println("bạn phải nhập 1 or 2 ");
        }
    }
    public static void main(String[] args) {
        hamchon();
    }
}
