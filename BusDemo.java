package Bus_reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

        public static void main(String[] args) {

            ArrayList<Bus> buses = new ArrayList<Bus>();
            ArrayList<Booking> bookings = new ArrayList<Booking>();
            System.out.println("===============");
            System.out.println("Buses Available");
            buses.add(new Bus(1,true,5));
            buses.add(new Bus(2,false,10));
            buses.add(new Bus(3,true,15));
            System.out.println("===============");

            int userOpt = 1;
            Scanner scanner = new Scanner(System.in);

            for(Bus b:buses) {
                b.displayBusInfo();
            }

            while(userOpt==1) {
                System.out.println("\nEnter 1 to Book and 2 to exit");
                userOpt = scanner.nextInt();
                if(userOpt == 1) {
                    Booking booking = new Booking();
                    if(booking.isAvailable(bookings,buses)) {
                        bookings.add(booking);
                        int journeydistance;
                        System.out.println("Enter the journey distance:");
                        journeydistance=scanner.nextInt();
                        if(journeydistance<=100){
                            System.out.println("Travel charges: Rs.80");
                        }
                        else if(journeydistance<=500){
                            System.out.println("Travel charges: Rs.400");
                        }
                        else{
                            System.out.println("Travel charges: Rs.550");
                        }
                        System.out.println("Your booking is confirmed");
                        System.out.println("Happy Journey..!!");
                    }
                    else{
                        System.out.println("Sorry. Bus is full. Try another bus or date.");
                        System.out.println("Thank you..Visit again!!");
                }
            }

        }

    }}


