public class Restaurant {

    // Properties
    private String name;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    //By doing private
    //nothing outside the class
    //can change or access it

    // Constructor
    public Restaurant() { //by having nothing in there all values are 0 or null
    }

    public Restaurant(String name, int waitTime, double rating, double avgPrice,
                      double distance, String hoursOpen) {
        this.name = name;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;

    }

    // Getters & Setters
    // Accessors & Mutators

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public String toString(){
        return "Restaurant name: " + name +
                "\nWait Time: " + waitTime +
                "\nRating: " + rating +
                "\nAverage Price: " + avgPrice +
                "\nDistance: " + distance +
                "\nHours of Operation: " + hoursOpen;

    }
}
