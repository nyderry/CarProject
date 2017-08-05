/**
 * Created by Ny Derry on 7/9/2017.
 */
public class UsedCar extends Car {

    private double mileage;

    public UsedCar( String maker, String model, int year, double price, double mileage) {
        super(maker,model,year,price);        //super getting from parent class, inheritance
        this.mileage = mileage;

    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //print out content of arrayList
    public String toString(){
        return super.toString()+" MileAge : "+this.mileage;
    }
}
