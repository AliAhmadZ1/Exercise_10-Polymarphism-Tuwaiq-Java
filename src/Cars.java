public class Cars implements Vehicle{
    private String model;
    private int days;

    //constructors
    public Cars(){

    }
    public Cars(String model, int days) {
        this.model = model;
        this.days = days;
    }



    //setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setDays(int days) {
        this.days = days;
    }

    //getters
    public String getModel() {
        return model;
    }
    public int getDays() {
        return days;
    }

    //methods
    @Override
    public double calculateRentalCost() {
        return 50*days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:");
        System.out.println("Car Model: "+model);
        System.out.println("Daily Rental Rate: "+"$"+50.0);
        System.out.println("Rental Cost: "+"$"+calculateRentalCost());
    }

}
