public class Restaurant {

    // Properties
    int waitTime;
    double rating;
    double avgPrice;
    double distance;
    String hoursOpen;

    //By doing private
    //nothing outside the class
    //can change or access it

    // Constructor
    public Restaurant() { //by having nothing in there all values are 0 or null
    }

    public Restaurant(int waitTime, double rating, double avgPrice,
                      double distance, String hoursOpen) {
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;

    }
}