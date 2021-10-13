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
public class bai4 {
    public static void trave(double a,double b) {
        double x;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tham so a va b:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        x = -b/a;
        System.out.println("phuong trinh " + a + "x" +" + "+ b + " = " );
        System.out.println("x = "+ x);
    }
    public static void main(String[] args) {
        double a = 0,b = 0;
        trave(a,b);
    }

    static void main(float a, float b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
