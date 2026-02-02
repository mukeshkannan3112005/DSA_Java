import java.util.*;
class Garage {
    private boolean isMechanicBusy = true; // Mechanic is initially busy

    // Method to request service from the mechanic
    public synchronized void requestService() {
        System.out.println("Car Owner: Checking if the car mechanic is free...");
        while (isMechanicBusy) {
            try {
                System.out.println("Car Owner: Mechanic is busy. I'll wait.");
                wait(); // Car owner waits if the mechanic is busy
            } catch (InterruptedException e) {
                System.out.println("Car Owner: Interrupted while waiting.");
            }
        }
        System.out.println("Car Owner: Mechanic is now free! Starting the service.");
    }

    // Method to notify the car owner when the mechanic is free
    public synchronized void completeRepair() {
        System.out.println("Car Mechanic: Repair work is done. Notifying the car owner.");
        isMechanicBusy = false; // Mechanic is now free
        notify(); // Notify the car owner
    }
}

class CarOwner extends Thread {
    private Garage garage;

    public CarOwner(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void run() {
        garage.requestService(); // Request service from the mechanic
    }
}

class CarMechanic extends Thread {
    private Garage garage;

    public CarMechanic(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void run() {
        System.out.println("Car Mechanic: Working on the repair...");
        try {
            Thread.sleep(5000); // Simulating repair work for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Car Mechanic: Interrupted while repairing.");
        }
        garage.completeRepair(); // Notify the car owner after repair
    }
}

public class demo {
    public static void main(String[] args) {
        Garage garage = new Garage();

        CarOwner carOwner = new CarOwner(garage);
        CarMechanic carMechanic = new CarMechanic(garage);

        carOwner.start(); // Start the car owner thread
        carMechanic.start(); // Start the car mechanic thread
    }
}

