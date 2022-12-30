package MODUL3_DIPTA;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
public static void main(String[] args) {
    Calculation cal = new Calculation();
    Thread thread = new Thread(cal);
    Scanner sc = new Scanner(System.in);
    boolean repeat = true;

    do{
      try{
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int pil = sc.nextInt();

        switch (pil){
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double sisi = sc.nextDouble();
            cal.setSquare(sisi);
            cal.run();
            System.out.println("\nThe calculation result: " + cal.getSquare());
            break;
          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double radius = sc.nextDouble();
            cal.setCircle(radius);
            cal.run();
            System.out.println("\nThe calculation result: " + cal.getCircle());
            break;
          case 3:
            System.out.print("\nEnter the upper side of the trapezoid : ");
            double a = sc.nextDouble();
            System.out.print("Insert the side of the base of the trapezoid : ");
            double b = sc.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double t = sc.nextDouble();
            cal.setTrapezoid(a, b, t);
            cal.run();
            System.out.println("\nThe calculation result: " + cal.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption Not Available!");
            continue;
        }
        repeat = false;

      }catch (InputMismatchException e) {
        System.out.println("\nError");
        sc.next();
      }catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }while (repeat);

    sc.close();
  }
}