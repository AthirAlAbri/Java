import java.util.Arrays;
import java.util.Date;
/**
 *  a CarParking class to model a multistory car parking building.
 */
public class CarParking {
    private Vehicle[][][] parkingBuilding;
    private int rows;
    private int columns;
    private int floors;


    //constructor with No parameters
    public CarParking() {
        this.floors = 3;
        this.rows = 7;
        this.columns = 7;
        parkingBuilding = new Vehicle[this.rows][this.columns][this.floors];
    }

    //constructor with parameters
    public CarParking(int row, int column, int floor ) {
        this.floors = floor;
        this.rows = row;
        this.columns = column;
        parkingBuilding = new Vehicle[this.rows][this.columns][this.floors];
        }


    /**
     * To returns true if the location specified by the floor,
     * row and column is already occupied by a vehicle.
     *
     * @param floor the number of floors
     * @param row   the number of rows
     * @param col   the number of columns
     * @return boolean true
     */
    public boolean isOccupied(int floor, int row, int col) {
        if (parkingBuilding[floor][row][col] == null) {
            return false;
        }
        return true;
    }

    /**
     * To  add the vehicle at the next empty slot. Slots are field
     * row by row (from left to right) starting from the first floor.
     *
     * @param v the type of vehicle
     */
    public void add(Vehicle v) {
        for (int i = 0; i < parkingBuilding.length; i++) {
            for (int j = 0; j < parkingBuilding[i].length; j++) {
                for (int l = 0; l < parkingBuilding[i][j].length; l++) {
                    if (isOccupied( i,j, l) != true) {
                        parkingBuilding[i][j][l] = v;
                    }
                }
            }
        }
    }

    /**
     * @param floor
     * @param row
     * @param col
     * @param rate
     * @return fee
     */
    public double remove(int floor, int row, int col, double rate) {
        double discount = 0.05;
        double fee;
        Date time = new Date();
        if (isOccupied(floor, row, col)) {
            if (floor == 0) {
                fee = rate * parkingBuilding[floor][row][col].getDuration(time)/60;
            } else {
                fee = rate * discount * parkingBuilding[floor][row][col].getDuration(time)/60;
            }
            parkingBuilding[row][col][floor] = null;
        } else {
            fee = 0;
        }
        return fee;
    }

    /**
     * To calculates the total expected revenue if all cars exit the building
     * at the given exitTime.
     *
     * @param rates    contain an element for every vehicle type
     * @param exitTime the exit time
     * @return total the total expected revenue
     */
    public double getTotalExpectedRevenue(double[] rates, Date exitTime) {
        double sedanDuration = 0;
        double suvDuration = 0;
        double truckDuration = 0;
        for (int i = 0; i < parkingBuilding.length; i++) {
            for (int j = 0; j < parkingBuilding[i].length; j++) {
                for (int l = 0; l < parkingBuilding[i][j].length; l++) {
                    if (parkingBuilding[i][j][l] != null) {
                        if (parkingBuilding[i][j][l].getType().equalsIgnoreCase("sedan")) {
                            sedanDuration += parkingBuilding[i][j][l].getDuration(exitTime);

                        } else if (parkingBuilding[i][j][l].getType().equalsIgnoreCase("suv")) {
                            suvDuration += parkingBuilding[i][j][l].getDuration(exitTime);

                        } else if (parkingBuilding[i][j][l].getType().equalsIgnoreCase("truck")) {
                            truckDuration += parkingBuilding[i][j][l].getDuration(exitTime);
                        }
                    }
                }
            }
        }
        //calculates the total revenue
        double total = sedanDuration * rates[0] + suvDuration * rates[1] + truckDuration * rates[2];

        return (total);
    }

    /**
     * To find and return the total number
     * of cars for a given type in a given floor.
     *
     * @param type  type of car
     * @param floor number of floors
     * @return total number of cars for a given type
     * in a given floor
     */
    public int getVehicleCount(String type, int floor) {
        int total = 0;
        for (int i = 0; i < parkingBuilding.length; i++) {
            for (int j = 0; j < parkingBuilding[i].length; j++) {
                if (isOccupied( i, j, floor) == true) {
                    if (parkingBuilding[i][j][floor].equals(type)) {
                        total++;
                    }
                }else{
                    return 0;
                }
            }
        }
        return total;
    }

    /**
     * To find and return the total revenue of a given
     * car type in a given floor for a given rate.
     * @param type  type of car
     * @param floor number of floors
     * @param rate
     * @return total revenue
     */
    public double getRevenue(String type, int floor, double rate) {
        double revenue = 0;
        Date time = new Date();
        for (int i = 0; i < parkingBuilding.length; i++) {
            for (int j = 0; j < parkingBuilding[i].length; j++) {
                if (isOccupied( i, j,floor) == true) {
                    if (parkingBuilding[i][j][floor].equals(type)) {
                        revenue +=  (rate * parkingBuilding[i][j][floor].getDuration(time));
                    }
                } else{
                    revenue = 0;
                }
            }
        }

        return revenue;
    }

    /**
     * To return true if it is possible to accommodate
     * all cars of the same type in separate floors.
     *
     * @return boolean true
     */
    public boolean canOrganizeByType() {
        int numOfSedan = 0;
        int numOfSuv = 0;
        int numOfTruck = 0;
        int condition = rows * columns;

        for (int i = 0; i < parkingBuilding.length; i++) {
            for (int j = 0; j < parkingBuilding[i].length; j++) {
                for (int l = 0; l < parkingBuilding[i][j].length; l++) {
                    if (isOccupied(i, j,l) ){
                        if (parkingBuilding[i][j][l].getType().equalsIgnoreCase("sedan")) {
                            numOfSedan++;
                        } else if (parkingBuilding[i][j][l].getType().equalsIgnoreCase("suv")) {
                            numOfSuv++;
                        } else if (parkingBuilding[i][j][l].getType().equalsIgnoreCase("truck")) {
                            numOfTruck++;
                        }
                    }
                }
            }
        }
        if (numOfSedan <= condition && numOfSuv <= condition && numOfTruck <= condition) {

            return true;

        }

        return false;
    }


    /**
     * To return the number of empty slots per floor
     * @return emptySlots per floor
     */
    public int getEmptySlots(int floor){
        int emptySlots=0;
        for (int i = 0; i < parkingBuilding.length; i++) {
            for (int j = 0; j < parkingBuilding[i].length; j++) {
                    if (isOccupied( i, j, floor) == false) {
                        emptySlots++;
                    }
            }
        }

        return emptySlots;
    }
}


