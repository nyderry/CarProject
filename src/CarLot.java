import java.util.ArrayList;

/**
 * Created by Ny Derry on 7/9/2017.
 */

public class CarLot extends Car {
    private double mileage;

    public CarLot(double mileage) {
        this.mileage = mileage;
    }

    public CarLot(String maker, String model, int year, double price, double mileage) {
        //super getting from parent class, inheritance
        super(maker, model, year, price);
        this.mileage = mileage;
    }

    public double getMileage() {return mileage; }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //print out content of arrayList
    public String toString(){
        return super.toString() + "\t mileage "+mileage;
    }
}
