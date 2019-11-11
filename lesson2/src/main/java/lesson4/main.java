package lesson4;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
    miniVan.passengers = 7;
    miniVan.tank = 70;
    miniVan.fuelper1000km = 8.5F;
    miniVan.name = "Mini Van";
        Vehicle sportCar;
        System.out.println("Distance: " +miniVan.distance() );

        sportCar = new Vehicle();
         sportCar.passenger = 2 ;
         sportCar.tank = 50 ;
         sportCar.fuelPer1000km = 18.5F;
         sportCar.name ="sportmahila";
        System.out.println("Distance: " +sportCar.distance());


    }
}
