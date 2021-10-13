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
public class bai5 {
    public static void main(String[] args) {
        float a= 0 ,b = 0, c = 0;
        giaiPTBac2(a,b,c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
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

    static void main(float a, float b, float c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
