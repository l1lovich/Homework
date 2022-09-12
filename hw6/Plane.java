package hw6;

public class Plane implements Printable, Flying{
   public String manufacturer;
   public String model;
   public double speedMph;
   public static long count  = 0L;
   long id;
  public Plane(){
        manufacturer = "";
        model = "";
        count = count + 1000;
        id = count;
    }
    public Plane(String man, String mod, double s){
      manufacturer = man;
      model = mod;
      speedMph = s;
      count = count + 1000;
      id = count;
    }
    public void Print(){
        System.out.println(manufacturer + " " + model +  id + " " + (speedMph * MPH_TO_KM));
    }
    public void Travel(){
        System.out.println("Самолет пролетит:" + (speedMph * MPH_TO_KM)*Travel(30));
    }
}
