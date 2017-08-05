/**
 * Created by Ny Derry on 7/9/2017.
 */
public class Car {
    private String maker;
    private String model;
    private int year;
    private double price;


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

    public double getPrice() {  return price;    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getYear() != car.getYear()) return false;
        if (Double.compare(car.getPrice(), getPrice()) != 0) return false;
        if (getMaker() != null ? !getMaker().equals(car.getMaker()) : car.getMaker() != null) return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (getMaker() != null ? getMaker().hashCode() : 0);
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + getYear();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
