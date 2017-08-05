import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;



/**
 * Created by Ny Derry on 7/9/2017.
 */

public class CarLot {




       private List<Car> carLotList = new ArrayList<Car>();

         public void displayALlCars(){

        for (Car car : carLotList) {
            System.out.println(car);
        }

    }


    public void addCarToLot(Car car){
        carLotList.add(car);

    }

    public void removeCarFromLot(Car car){
        for(Car lotcar:carLotList){
            if(lotcar.equals(car)){
                carLotList.remove(lotcar);
            }

        }

    }

    public Car findCarByLocation(int location){

        return carLotList.get(location);

    }

    public void replaceCar(Car car, int location){
        carLotList.set(location, car);
    }



     private void addAllCars(List<Car> cars){
        this.carLotList.addAll(cars);
     }


}
