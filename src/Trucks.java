public class Trucks implements Vehicle{
    private String type;
    private int week;

    public Trucks() {
    }
    public Trucks(String type, int week) {
        this.type = type;
        this.week = week;
    }

    //setters

    public void setType(String type) {
        this.type = type;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    //getters
    public String getType() {
        return type;
    }
    public int getWeek() {
        return week;
    }

    //methods
    @Override
    public double calculateRentalCost() {
        return 500*week;
    }
    @Override
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Truck Type: "+type);
        System.out.println("Weekly Rental Rate: "+"$"+500.0);
        System.out.println("Rental Cost: "+"$"+calculateRentalCost());
    }


}
