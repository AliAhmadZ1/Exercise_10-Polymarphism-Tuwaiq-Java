import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static {
        System.out.println("Exercise 10 Tuwaiq Java bootCamp");
        System.out.println("Ali Ahmed Alshehri");
        System.out.println("=====================================");
        Scanner input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList rentedVehicles = new ArrayList();
        int choice = 0;
        String vehicle = "";
        int rentAmount = 0;
//        Vehicle car = new Cars();
//        Vehicle bike = new Bikes();
//        Vehicle truck = new Trucks();
        System.out.println("Vehicle Rental System \n" +
                "1. Rent a Car \n" +
                "2. Rent a Bike \n" +
                "3. Rent a Truck \n" +
                "4. View Rented Vehicles \n" +
                "5. Exi");

        while (choice != 5) {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Car Model: ");
                    vehicle = input.next();
                    System.out.print("Enter Rental Days: ");
                    rentAmount = input.nextInt();
                    Vehicle car = new Cars(vehicle, rentAmount);
                    car.displayDetails();
                    System.out.println("--------------------");
                    rentedVehicles.add("Car model: " + vehicle);
                    rentedVehicles.add("Rental days: " + rentAmount);
                }
                case 2 -> {
                    System.out.print("Enter Bike Brand: ");
                    vehicle = input.next();
                    System.out.print("Enter Rental Hours: ");
                    rentAmount = input.nextInt();
                    Vehicle bike = new Bikes(vehicle, rentAmount);
                    bike.displayDetails();
                    System.out.println("--------------------");
                    rentedVehicles.add("Bike brand: " + vehicle);
                    rentedVehicles.add("Rental hours: " + rentAmount);
                }
                case 3 -> {
                    System.out.print("Enter Truck Type: ");
                    vehicle = input.next();
                    System.out.print("Enter Rental Weeks: ");
                    rentAmount = input.nextInt();
                    Vehicle truck = new Trucks(vehicle, rentAmount);
                    truck.displayDetails();
                    System.out.println("--------------------");
                    rentedVehicles.add("Truck type: " + vehicle);
                    rentedVehicles.add("Rental weeks" + rentAmount);
                }
                case 4 -> {
                    System.out.println(rentedVehicles);
                }
                case 5 -> {
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;
                }
            }
        }
    }
}