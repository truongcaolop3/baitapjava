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
public class bai7 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isAction = true;
    public static void main(String[] args) {
        while (isAction) {
            trave();
        }
    }
    public static void trave() {
        System.out.println("\t--------------------");
        System.out.println("1.Lựa chọn 1 để tiếp tục chương trình");
        System.out.println("2.Lựa chọn 2 để thoát");
        
        System.out.print("Nhập lựa chọn: ");
        int chon = sc.nextInt();
        
        switch(chon) {
            case 1: 
                Action();
                break;
            case 2:
                isAction = false;
                System.out.println("Chương trình đã thoát....");
                break;
            default:
                break;
        }
        
    }
    public static void Action() {
        
       
        System.out.println("1.Lựa chọn 1 để giải phương trình bậc 1");
        System.out.println("2.Lựa chọn 2 để giải phương trình bậc 2");
        System.out.println("3.Lựa chọn 3 để thoát");

        
        
        System.out.print("Nhập sự lựa chọn: ");
        int chon = sc.nextInt();
        switch(chon) {
            case 1: 
                giaiPTBac1();
                break;
            case 2:
                giaiPTBac2();
                break;
            case 3:
                System.out.println("Chương trình đã thoát....");
                break;
            default:
                break;
        }

    }
    
    public static void giaiPTBac1() {
        System.out.print("Nhập các hệ số a và b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (a == 0 && b != 0){
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Nghiệm của phương trình là: " + (double)-b/a);
        }
    }
    
    public static void giaiPTBac2() {
        System.out.print("Nhập các hệ số a và b và hằng số tự do c: ");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
  
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
       
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
}
