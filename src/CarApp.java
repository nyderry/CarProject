import sun.text.resources.FormatData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ny Derry on 7/9/2017.
 * LAB 11
 */
public class CarApp {


    public static void main(String[] args) {
        //   List<Car> cars = new ArrayList<Car>();
        List<NewCar> newCarList = new ArrayList<NewCar>();
        List<UsedCar> usedCarList = new ArrayList<UsedCar>();
        List<CarLot> allCarsList = new ArrayList<CarLot>();

        Scanner scan = new Scanner(System.in);
        String userInput = " ";
        System.out.println("Welcome to Car Match Application!\n ");


        String continu1 = "y";

        while (continu1.equalsIgnoreCase("y")) {
            System.out.println("Please select one of the following carmakers: 'Ford', 'Chevy', 'Honda', 'GM', 'Toyota', 'Chrysler'  ");
            userInput = scan.nextLine();


            //when write code that could throw an exception must declare the exception
            try {
                NewCar jingsCar = new NewCar();
                jingsCar.setMaker("Ford");
                jingsCar.setModel("T");
                jingsCar.setYear(2017);
                jingsCar.setPrice(234000.23);
               // System.out.println("Jing's new car: " + jingsCar);
                CarLot jingsCar2 = new CarLot("Ford", "T", 2017, 234000.23, 0);
                allCarsList.add(jingsCar2);

                NewCar nysCar = new NewCar("Chevy", "Malibu", 2017, 123456.98);
                //System.out.println("Ny's new car: " + nysCar);
                CarLot nysCar2 = new CarLot("Chevy", "Malibu", 2017, 123456.98, 0);
                allCarsList.add(nysCar2);

                NewCar lotusCar = new NewCar("Honda", "Civic", 2017, 13000);
                //System.out.println("Lotus'new car: " + lotusCar);
                newCarList.add(lotusCar);
                CarLot lotusCar2 = new CarLot("Honda", "Civic", 2017, 13000, 0);
                allCarsList.add(lotusCar2);

                UsedCar irisCar = new UsedCar("GM", "Equinox", 2017, 123456.98, 12345);
                //System.out.println("Iris' used car: " + irisCar);
                usedCarList.add(irisCar);
                CarLot irisCar2 = new CarLot("GM", "Equinox", 2017, 123456.98, 12345);
                allCarsList.add(irisCar2);

                UsedCar joeCar = new UsedCar("Toyota", "Spider", 2011, 8000, 11000);
               // System.out.println("Joe's used car: " + joeCar);
                usedCarList.add(joeCar);
                CarLot joeCar2 = new CarLot("Toyota", "Spider", 2011, 8000, 11000);
                allCarsList.add(joeCar2);

                UsedCar chayCar = new UsedCar("Chrysler", "Minivan", 2005, 5000, 30000);
               // System.out.println("Chay's used car: " + chayCar);
                usedCarList.add(chayCar);
                CarLot chayCar2 = new CarLot("Chrysler", "Minivan", 2005, 5000, 30000);
                allCarsList.add(chayCar2);




          /* System.out.println(cars);

            System.out.println(newCarList);

            System.out.println(usedCarList);

            System.out.println(newCarList);

            System.out.println(allCarsList); */




           /* private UsedCar findCar(UsedCar) {
                for(UsedCar car:usedCarList){
                    if(car.getMaker().equals(UsedCar)){
                        return UsedCar;
                    }
                }

                return null;
            }*/


        /*    CarApp carlot = new CarApp();
            carlot.addCar2Lot(jingsCar);
            carlot.addCar2Lot(nysCar);
            carlot.addCar2Lot(irisCar);

            //    System.out.println("Before remove iris car");

            carlot.showMyLot();


            //      carlot.removeCarFromCarlot(irisCar);
            //  System.out.println("After remove iris car");

            carlot.showMyLot();

           // Car fordCar = carlot.findCar("Ford");


          //  if (fordCar != null) {
                //       System.out.println("Found it "+fordCar);
          //  }
         //   Car nissanCar = carlot.findCar("Nissan");

         //   if (nissanCar != null) {
         //       System.out.println("Found it " + nissanCar);
         //   } else {
                //      System.out.println("Can't find this maker.");
            } */



            for (CarLot allCars : allCarsList) {
                if (allCars.getMaker().equals(userInput)) {
                    System.out.println(allCars.getPrice());
                    System.out.println(allCars.getMileage());
                }
// need a method to clear the values for next iteration
            }

            } catch (Exception e) {
                e.printStackTrace();
            }
            //String allCars = " ";
            // }

  /*  private void addCar2Lot(Car car) {
        //         cars.add(car);
    }
    //    private void removeCarFromCarlot(Car car){
    //        cars.remove(car);
    //    }

    //  private List getCars(){
    //             return cars;
    // }

    private void showMyLot() {
        //      for(Car car:cars){
        //       System.out.println(car);
    }

    // }

   private Car findCar(String maker) {
             for(Car car:cars){
               if(car.getMaker().equals(maker)){
                     return car;
              }
          }

          return null;
          }

  /*  @Override
    public String toString() {
        return "CarApp{" +
                "cars=" + cars +
                ", newCarList=" + newCarList +
                ", usedCarList=" + usedCarList +
                '}'; */



        System.out.println("\n Do you want to select again? y/n");
        continu1 = scan.nextLine();

        }


        if(continu1.equalsIgnoreCase("n")){
            System.out.println("Thank you for choosing the Car Match Application!");
        }

    }
}
//}

