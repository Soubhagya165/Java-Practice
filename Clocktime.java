import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clocktime {
        


    public static void main (String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // // Display the formatted current time
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current Time: " + formattedTime);
    }
}
    

