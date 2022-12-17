import java.util.Date;

/**
 * a Java class that models a Vehicle.
 */
public class Vehicle {
    //instance variables
    private Date Time;
    private String carType;
    private long duration;

    public Vehicle(String carType) {
        this.carType = carType;
        this.Time = new Date();
    }

    public Vehicle(){
        this.carType = null;
        this.Time = new Date();

    }

    /**
     * To  set the type of the vehicle to either Sedan or SUV
     * or Truck.
     * @param type ot the vehicle
     */

    public void setType(String type) {
        if (type.equalsIgnoreCase("sedan")) {
            this.carType = type;
        }else if (type.equalsIgnoreCase("suv")) {
            this.carType = type;
        }else if (type.equalsIgnoreCase("truck")) {
            this.carType = type;
        } else {
            System.out.println("Error .. not clear car type Try again");
            System.exit(0);
        }
    }

    /**
     * To  set the time at which the vehicle has
     * entered the parking.
     * @param entryTime the time when car entered
     */

    public void setEntryTime(Date entryTime) {
        this.Time = entryTime;
    }

    /**
     * To return the duration (in minutes) from the time
     * the vehicle entered the parking until the given exitTime.
     * @param exitTime the time when car exit
     * @return the duration from vehicle entered until exit time
     */

    public double getDuration(Date exitTime) {
        this.duration = exitTime.getTime() - Time.getTime();
        return this.duration;
    }

    /**
     * To return either Sedan or SUV or Truck based on the vehicle
     * type.
     * @return CarType Sedan or SUV or Truck
     */

    public String getType() {

        if (carType.equalsIgnoreCase("sedan")) {
            carType = "SEDAN";
        }else if (carType.equalsIgnoreCase("suv")) {
            carType = "SUV";
        }else if (carType.equalsIgnoreCase("truck")) {
            carType = "TRUCK";
        }else {
            System.out.println("Error .. not clear car type Try again");
            System.exit(0);
        }
        return carType;
    }
}