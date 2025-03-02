import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main { //start class Main
    static { //static block
        System.out.println("Exercise 10 Tuwaiq Java bootCamp");
        System.out.println("Ali Ahmed Alshehri");
        System.out.println("=====================================");
        Scanner input = new Scanner(System.in);
    }

    public static void main(String[] args) { //start main method
        Scanner input = new Scanner(System.in);
        //declaration

        List<Vehicle> rentedVehicles = new ArrayList<Vehicle>();
        int choice = 0;
        String vehicle = "";
        int rentAmount = 0;

        // print menu-driven
        System.out.println("Vehicle Rental System \n" +
                "1. Rent a Car \n" +
                "2. Rent a Bike \n" +
                "3. Rent a Truck \n" +
                "4. View Rented Vehicles \n" +
                "5. Exi");


        while (choice != 5) { //while loop
            // input choice from user
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            //switch case
            switch (choice) { //start switch case
                case 1 -> {
                    System.out.print("Enter Car Model: ");
                    vehicle = input.next();
                    System.out.print("Enter Rental Days: ");
                    rentAmount = input.nextInt();
                    Vehicle car = new Cars(vehicle, rentAmount);
                    car.displayDetails();
                    System.out.println("--------------------");
                    rentedVehicles.add(car);
                }
                case 2 -> {
                    System.out.print("Enter Bike Brand: ");
                    vehicle = input.next();
                    System.out.print("Enter Rental Hours: ");
                    rentAmount = input.nextInt();
                    Vehicle bike = new Bikes(vehicle, rentAmount);
                    bike.displayDetails();
                    System.out.println("--------------------");
                    rentedVehicles.add(bike);
                }
                case 3 -> {
                    System.out.print("Enter Truck Type: ");
                    vehicle = input.next();
                    System.out.print("Enter Rental Weeks: ");
                    rentAmount = input.nextInt();
                    Vehicle truck = new Trucks(vehicle, rentAmount);
                    truck.displayDetails();
                    System.out.println("--------------------");
                    rentedVehicles.add(truck);
                }
                case 4 -> {
                    System.out.println("Rented Vehicles: ");
                    for (int i = 0; i < rentedVehicles.size(); i++) {
                        rentedVehicles.get(i).displayDetails();
                        System.out.println();
                    }
                }
                case 5 -> {
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;
                }
                default -> System.out.println("Wrong choice try AGAIN!!");
            }//end switch
        }// end while loop
    } //end main method
} //end class Main