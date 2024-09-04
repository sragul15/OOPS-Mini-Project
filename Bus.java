package Bus_reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bus {
        private int busNo;
        private boolean ac;
        private int capacity; //get and set

        Bus(int no,boolean ac,int cap){
            this.busNo = no;
            this.ac = ac;
            this.capacity = cap;
        }

        public int getBusNo(){
            return busNo;
        }

        public boolean isAc(){
            return ac;
        }
        public int getCapacity(){
            return capacity;
        }

        public void setAc(boolean val) {
            ac = val;
        }

        public void setCapacity(int cap) {
            capacity = cap;
        }

        public void displayBusInfo(){
            System.out.println("Bus No:" + busNo + " with Total Capacity: " +capacity);
        }
    }




