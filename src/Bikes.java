public class Bikes implements Vehicle{
    private String brand;
    private int hour;

    //constructors
    public Bikes() {
    }

    public Bikes(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    //getters
    public String getBrand() {
        return brand;
    }

    public int getHour() {
        return hour;
    }

    //methods
    @Override
    public double calculateRentalCost() {
        return 10*hour;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Bike Brand: "+brand);
        System.out.println("Hourly Rental Rate: "+"$"+10.0);
        System.out.println("Rental Cost: "+"$"+calculateRentalCost());
    }
}
