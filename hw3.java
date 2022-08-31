import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
    static double div(double x, double y){
        return x / y;
    }
    static int add(int q, int w){
        return q+w;
    }
    static int prod(int e, int r){
        return e * r;
    }
    static int negative(int t){
        return t*-1;
    }
    static void doubleElements(double[] doubles){
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = doubles[i] * 2;

        }
    }
    static double[] arrayN(double[] doubleArr, int N) {
       return null;
    }
    public static void main(String[] args) {
        System.out.println("homework1");
        double a = 5;
        double b = 7;
        double c = div(a,b);
        System.out.println(c);

        System.out.println("homework2");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int t = sc.nextInt();
        int y = sc.nextInt();
        int result = - add(r,r) * (prod(t,t) + negative(y));
        System.out.println(result);

        System.out.println("homework3");
        double u = sc.nextDouble();
        double i = sc.nextDouble();
        double o = sc.nextDouble();
        double[] result2 = new double[]{u,i,o};
        System.out.println(Arrays.toString(result2));
        doubleElements(result2);
        System.out.println(Arrays.toString(result2));

        System.out.println("homework4");
        int p = sc.nextInt();
        double [] result3 = new double[]{2,4,5,6};
        double[] newArr = new double[result3.length * p];

        for (int z = 0; z < result3.length; z++) {
            newArr[z] = result3[z];
newArr[newArr.length-1] = result3[z];
        }
        arrayN(result3,p);
       System.out.println(Arrays.toString(newArr));


    }
}
