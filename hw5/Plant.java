package hw5;

public abstract class Plant {
    double height;
    double width;

    Plant(){}

    Plant(double h, double w){
        width = w;
        height = h;
    }

    public abstract void grow();
}
