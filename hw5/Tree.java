package hw5;

public class Tree extends Plant {
    public Tree() {
    }

    public Tree(double h, double w) {
        super(h, w);
    }

    @Override
    public void grow() {
        this.height = height+ 0.9;
    }
}
