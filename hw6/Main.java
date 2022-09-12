package hw6;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
//    static void exceptions() throws FileNotFoundException {


    public static void main(String[] args)  throws FileNotFoundException {
//exceptions();
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();

        try {
//            System.out.println("Вы ввели Х - " + x + " Y - " + y);
//        } catch (InputMismatchException in) {
//            System.out.println("Вы ввели не целые числа, попробуйте снова!");
//            System.out.println(in.getMessage());
//        } catch (ArithmeticException Ar){
//            System.out.println("Деление на ноль, нет ответа");
//            System.out.println(Ar.getMessage());
        }catch (InputNotPositiveException pos) {
            System.out.println("Вы ввели не положительное число");
//        System.out.println(Math.sqrt(x) * Math.sqrt(y));
        }
        Plane Tu = new Plane(sc.nextLine(), sc.nextLine() , sc.nextDouble());
        if (Tu.speedMph <= 0){
throw new InputNotPositiveException();
}
        Tu.Print();
        Tu.Travel();

        }
    }


