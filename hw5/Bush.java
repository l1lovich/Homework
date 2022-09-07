package hw5;

public class Bush extends Plant{
    public Bush() {
    }

    public Bush(double h, double w) {
        super(h, w);
    }

    @Override
    public void grow() {
        this.width = width + 0.05;
    }
}
