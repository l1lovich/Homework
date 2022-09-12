package hw6;

public interface Flying {
    static final double MPH_TO_KM = 1.60934;

    public default double Travel(double time){
        return time;
    }
}
