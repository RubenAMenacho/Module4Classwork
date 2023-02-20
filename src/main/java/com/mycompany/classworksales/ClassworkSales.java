/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classworksales;
import java.util.Scanner;
/**
 *
 * @author ramlifting
 */
public class ClassworkSales {

    public static void main(String[] args) {
        
        int[] counters = new int[9];

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter gross sales (-1 to exit): ");
            double sales = input.nextDouble();

            if (sales == -1) {
                break;
            }

          
            double salary = 200 + 0.09 * sales;

          
            if (salary >= 200 && salary < 300) {
                counters[0]++;
            } else if (salary >= 300 && salary < 400) {
                counters[1]++;
            } else if (salary >= 400 && salary < 500) {
                counters[2]++;
            } else if (salary >= 500 && salary < 600) {
                counters[3]++;
            } else if (salary >= 600 && salary < 700) {
                counters[4]++;
            } else if (salary >= 700 && salary < 800) {
                counters[5]++;
            } else if (salary >= 800 && salary < 900) {
                counters[6]++;
            } else if (salary >= 900 && salary < 1000) {
                counters[7]++;
            } else if (salary >= 1000) {
                counters[8]++;
            }
        }

      
        System.out.println("Salary Range     # of Salespeople");
        System.out.println("------------------------------------");
        System.out.printf("$%3d-$%3d        %d%n", 200, 299, counters[0]);
        System.out.printf("$%3d-$%3d        %d%n", 300, 399, counters[1]);
        System.out.printf("$%3d-$%3d        %d%n", 400, 499, counters[2]);
        System.out.printf("$%3d-$%3d        %d%n", 500, 599, counters[3]);
        System.out.printf("$%3d-$%3d        %d%n", 600, 699, counters[4]);
        System.out.printf("$%3d-$%3d        %d%n", 700, 799, counters[5]);
        System.out.printf("$%3d-$%3d        %d%n", 800, 899, counters[6]);
        System.out.printf("$%3d-$%3d        %d%n", 900, 999, counters[7]);
        System.out.printf("$%4d and over   %d%n", 1000, counters[8]);
    }
}

