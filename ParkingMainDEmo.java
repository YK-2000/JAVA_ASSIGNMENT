package assignment;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParkingMainDEmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            System.out.print("Enter In-Time (HH:mm): ");
            LocalTime inTime = LocalTime.parse(scanner.next(), formatter);

            System.out.print("Enter Out-Time (HH:mm): ");
            LocalTime outTime = LocalTime.parse(scanner.next(), formatter);

            if (outTime.isBefore(inTime)) {
                System.out.println("Error: Out-Time must be after In-Time.");
                return;
            }

            long totalMinutes = Duration.between(inTime, outTime).toMinutes();
            long hours = totalMinutes / 60;
            long remainingMinutes = totalMinutes % 60;

            int totalCharge = (int) (hours * 10 + (remainingMinutes > 0 ? 10 : 0));

            System.out.println("Total Parking Fee: " + totalCharge + " Rupees");
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter time in HH:mm format.");
        } finally {
            scanner.close();
        }
    }
}

