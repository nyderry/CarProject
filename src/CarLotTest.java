import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ny Derry on 8/5/2017.
 */
public class CarLotTest {

    private CarLot nysLot = new CarLot();

    //private CarLot


    @org.junit.Before
    public void setUp() throws Exception {

        try{

            nysLot.addCarToLot(new Car("GM","GMC",2017,12345.43));
            nysLot.addCarToLot(new Car("Toyota","Cammy",2017,25000.50));
            nysLot.addCarToLot(new Car("Chrysler","200",2017,1450.63));
            nysLot.addCarToLot(new UsedCar("Nissan","Quest",2015,15000.43,1100));
            nysLot.addCarToLot(new UsedCar("GM","Spark",2011,7000.43,1300));
            nysLot.addCarToLot(new UsedCar("Ford","Fusion",2008,10000.30,2000));

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void displayALlCars() throws Exception {
        nysLot.displayALlCars();

    }

    @Test
    public void addCarToLot() throws Exception {
        try{

            nysLot.addCarToLot(new Car("Ford","Fusion",2017,12345.43));
            nysLot.displayALlCars();

        }catch (Exception e){

        }
    }

    @Test
    public void removeCarFromLot() throws Exception {

        try{

            nysLot.addCarToLot(new Car("Ford","Fusion",2017,12345.43));
            nysLot.displayALlCars();
            nysLot.removeCarFromLot(new Car("Ford","Fusion",2017,12345.43));
            nysLot.displayALlCars();

        }catch (Exception e){

        }
    }

    @Test
    public void findCarByLocation() throws Exception {
    }

    @Test
    public void replaceCar() throws Exception {
    }

}