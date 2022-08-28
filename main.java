import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("homework 1");
//
//        short x = 12;
//        int y = 13;
//        long z = 34;
//        System.out.println(x + y + z);
//        System.out.println(x * y * z);
//        System.out.println(x + y == z);
//
//        System.out.println("homework 2");
//
//        int numberorg = 12;
//        int number = ((numberorg + 3) * 123 - numberorg) * 45;
//        short numberresult = (short) number;
//        System.out.println(number);
//        System.out.println(numberresult);

        System.out.println("Homework 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int y = sc.nextInt();
        if ((y >= 1 && y <= 100) || (y >= -1000 && y <= -100)){
            System.out.println("+");
        } else {
            System.out.println("-");
        }

        System.out.println("Homework 2");
        double[] ArrayDouble;
        ArrayDouble = new double[5];
        System.out.println(Arrays.toString(ArrayDouble));

        ArrayDouble[0] = 1.1;
        ArrayDouble[1] = 5.2;
        ArrayDouble[2] = 8.4;
        ArrayDouble[3] = 7.5;
        ArrayDouble[4] = 6.3;

        System.out.println(Arrays.toString(ArrayDouble));
        ArrayDouble[0] = 1.00001;
        ArrayDouble[4] = -0.189;
        System.out.println(Arrays.toString(ArrayDouble));

        System.out.println("Homework 3");
        Scanner scannerwhile = new Scanner(System.in);
        int Integer = scannerwhile.nextInt();
        while (Integer > 0){
            System.out.println("Цикл while");
            Integer = Integer - 1;
        }
        System.out.println("!Цикл while закончен!");

        System.out.println("Homework 4");
        Scanner scannerfor = new Scanner(System.in);
        int sc1 = scannerfor.nextInt();
        int[] ArrInt;
        ArrInt = new int[sc1];
        for (int i = 0; i < ArrInt.length; i++) {
            System.out.println(i * 11);
        }
        System.out.println("Homework 5");
        System.out.println("Введите 3 дробных числа");

        Scanner scsqrt = new Scanner(System.in);
        System.out.println("Введите 1 дробное число");
        double a = scsqrt.nextDouble();
        System.out.println("Введите 2 дробное число");
        double b = scsqrt.nextDouble();
        System.out.println("Введите 3 дробное число");
        double c = scsqrt.nextDouble();
        double D;
        D = b * b - 4 * a * c;
        if (D > 0){
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 *a);
            x2 = (-b - Math.sqrt(D)) / (2 *a);
            System.out.println("Корни уровнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0){
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: х =" + x);
        }
        else {
            System.out.println("Корней нет");
        }

        Scanner triangle = new Scanner(System.in);
        System.out.println("Введите число:");
        int tri = triangle.nextInt();
        for (int i = 0; i < tri; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
        }
            System.out.println(" ");
            }

    }
}
