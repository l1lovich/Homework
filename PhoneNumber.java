package hw;

import java.util.Objects;

public class PhoneNumber {
    int num;
    String numType;

    PhoneNumber(){
        numType = "";
    }
    PhoneNumber(int i, String n){
       num = i;
       numType = n;
    }
   void print(){
        System.out.println( num + " " + numType);
    }
    void changeType(String n1){
numType = n1;


    }
    int getNum(){
        return num;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "numType= " + numType + "Не задан" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return num == that.num && Objects.equals(numType, that.numType) &&
               Objects.equals(num, that.num) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, numType);
    }
}
