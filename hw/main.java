package hw;

import java.util.Arrays;

public class main {
   static void homework1() {
        double[] arr = new double[]{-1, -0.9, -0.8, -0.7, -0.6, -0.5, 0, 0.1, 0.2, 0.3, 0.4, 0.5, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.sin(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
static void  homework2(){


}


    public static void main(String[] args) {
//       homework1();
        PhoneNumber newNum = new PhoneNumber();
        System.out.println(newNum.num + " " + newNum.numType);
        System.out.println(newNum.num);
        System.out.println(newNum.numType);

        PhoneNumber newNum1 = new PhoneNumber(890433333, "Личный номер");
        newNum1.print();
        System.out.println(newNum1.getNum());
        newNum1.changeType("Рабочий");
        newNum1.print();




    }
}
