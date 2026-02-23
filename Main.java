import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Instantiate an ArrayList to hold Restaurant Objects
        ArrayList<Restaurant> restaurantArrayList = new ArrayList<>();


        // Take user input using JOptionPane and store in variables
        String name = JOptionPane.showInputDialog("Enter Restaurant Name: ");

        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter Restaurant Wait Time: "));

        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Rating (ex.0.0 - 5.0): "));

        double avgprice = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Average Price(ex. 12.50): "));

        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Distance In Miles(ex. 5.5): "));

        String hoursopen = JOptionPane.showInputDialog("Enter Restaurant Open hours(ex. 09:00am - 10:00pm): ");

        // Instantiate Restaurant object with those variables
        Restaurant userRestaurant = new Restaurant(name, waitTime, rating, avgprice, distance, hoursopen);
        System.out.println(userRestaurant);

        // Add User's Restaurant Object to the ArrayList
        restaurantArrayList.add(userRestaurant);

    }

}
