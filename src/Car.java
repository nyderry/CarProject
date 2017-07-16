/**
 * Created by Ny Derry on 7/9/2017.
 */
public class Car {
    private String maker;
    private String model;
    private int year;
    private double price;

    public Car() {

    }

    public Car(String maker, String model, int year, double price) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


  //  public String toString(){
  //      return maker +"\t" +model+" \t" + year;
  //  }
}
