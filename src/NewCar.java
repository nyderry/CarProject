/**
 * Created by Ny Derry on 7/16/2017.
 */
public class NewCar extends Car {
    public NewCar() {


    }

    public NewCar(String maker, String model, int year, double price) {
        //super getting from parent class, inheritance
        super(maker, model, year, price);



    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
