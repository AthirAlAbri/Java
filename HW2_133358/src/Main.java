

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CarParking parking = null;
        //print the header of the program
        String header = "-";
        System.out.println(header.repeat(68));
        System.out.printf("%48S\n", "Welcome to our parking space");
        System.out.println(header.repeat(68));

        int floor = 0;
        int row;
        int column;


            System.out.print("\nEnter row, column, and floor: ");
            row = in.nextInt();
            column = in.nextInt();
            floor = in.nextInt();
            parking = new CarParking( floor, row, column);


            System.out.print("\nChoose select an action from the following menu: " +
                    "\n 1: to Add a vehicle" +
                    "\n 2: to Remove a vehicle" +
                    "\n 3: to Display statistics" +
                    "\n 4: to Check arrangement" +
                    "\n 5: to Exit the program ");
            System.out.print("\n\nYour choice is: ");
            boolean flag = true;


            while (flag) {
                int choice = in.nextInt();
                System.out.println();
                if (choice > 5) {
                    System.out.println("Not valid input");

                } else if (choice == 1) {
                    System.out.print("Enter car type(sedan, suv, truck): ");
                    String type = in.next();
                    Vehicle car = new Vehicle(type);
                    car.setType(type);
                    parking.add(car);
                    System.out.println("The car was added successfully");


                } else if (choice == 2) {
                    System.out.print("Enter number of floor, row, column: ");
                    int spisificFloor = in.nextInt();
                    int spisificRow = in.nextInt();
                    int spisificColum = in.nextInt();
                    System.out.print("Enter the parking rate: ");
                    double rate = in.nextDouble();
                    if (parking.isOccupied(spisificFloor, spisificRow, spisificColum)) {
                        System.out.print("The car has been removed...");
                        System.out.println("The fee is: " + parking.remove(spisificFloor, spisificRow, spisificColum, rate));

                    } else {
                        System.out.println("There is no car here");
                    }

                } else if (choice == 3) {
                    double[] rates = new double[3];
                    System.out.print("Please enter the rate of sedan type: ");
                    rates[0] = in.nextDouble();
                    System.out.print("Please enter the rate of suv type: ");
                    rates[1] = in.nextDouble();
                    System.out.print("Please enter the rate of truck type: ");
                    rates[2] = in.nextDouble();
                    //expected revenue
                    Date exitTime = new Date();
                    System.out.println(header.repeat(68));
                    System.out.println("The total expected revenue: " + parking.getTotalExpectedRevenue(rates, exitTime));
                    System.out.println();


                    System.out.println(header.repeat(68));
                    System.out.printf("%44S\n", "Number of cars per floor");
                    System.out.println(header.repeat(68));

                    System.out.printf("%12s%12s%12s%12s%12s\n", "Floor", "Sedan", "SUV", "Truck", "Empty");


                    //Num of cars by type and floor and num of empty slots
                    int total1;
                    int total2;
                    int total3;
                    int emptySlot = 0;
                    for (int i = 0; i < floor; i++) {
                        total1 = parking.getVehicleCount("sedan", i);
                        total2 = parking.getVehicleCount("suv", i);
                        total3 = parking.getVehicleCount("sedan", i);
                        emptySlot = parking.getEmptySlots(i);
                        System.out.printf("%12d%12d%12d%12d%12d\n", i, total1, total2, total3, emptySlot);


                    }

                    System.out.println();
                    System.out.println(header.repeat(68));
                    System.out.printf("%38S\n", "Revenue per floor");
                    System.out.println(header.repeat(68));

                    System.out.printf("%12s%12s%12s%12s\n", "Floor", "Sedan", "SUV", "Truck");
                    //Revenue per type and floor
                    double revSedan = 0;
                    double revSuv = 0;
                    double revTruck = 0;

                    for (int i = 0; i < floor; i++) {
                        revSedan = parking.getRevenue("sedan", i, rates[0]);
                        revSuv = parking.getRevenue("suv", i, rates[1]);
                        revTruck = parking.getRevenue("truck", i, rates[2]);
                        System.out.printf("%12d%12.2f%12.2f%12.2f\n", i, revSedan, revSuv, revTruck);

                    }


                } else if (choice == 4) {
                    if (parking.canOrganizeByType() == true) {
                        System.out.println("The cars can be arranged based on their type into separated floors");
                    } else {
                        System.out.println("Not possible to rearrange cars based on their type into separated floors");
                    }


                } else if (choice == 5) {
                    System.out.println("The program has been stopped");
                    System.exit(0);
                    flag = false;

                }

                System.out.println(header.repeat(68));
                System.out.print("Your choice is: ");
            }
        }

    }
