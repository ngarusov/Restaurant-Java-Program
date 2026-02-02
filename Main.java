public class Main {
    public static void main(String[] args) {

        Restaurant mcDonalds = new Restaurant(); // Variable is now restaurant type
        Restaurant chipotle = new Restaurant(30, 4.5, 14, 5 ,
                "06:00am - 09:00pm");

        System.out.println(chipotle.waitTime);
        System.out.println(chipotle.rating);
        System.out.println(chipotle.avgPrice);
        System.out.println(chipotle.distance);
        System.out.println(chipotle.hoursOpen);


    }
}
