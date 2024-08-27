/*
 * @ (#) TestRectangle.java   1.0     8/27/2024
 * Copyright (c) 2024 IUH. ALL right reserved.
 */
package iuh.fit.se;

/**
 * @description: This class represents a bank with many bank accounts
 * @author: Binh, Nguyen Van Binh
 * @version: 1.0
 * @created: 8/27/2024
 */
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        // input value of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // create object Rectangle
        Rectangle rect = new Rectangle(length, width);

        // print Length, Width, Area, Perimeter of the Rectangle
        System.out.println(rect);

    }
}
