package hw5;

public class main {
    public static void main(String[] args) {
        Plant Oak = new Tree();
        System.out.println(Oak.height + " "+ Oak.width);
        Oak.grow();
        System.out.println(Oak.height + " "+ Oak.width);

        Plant Rose = new Bush();
        System.out.println(Rose.height + " " + Rose.width);
        Rose.grow();
        System.out.println(Rose.height + " " + Rose.width);
    }
}
