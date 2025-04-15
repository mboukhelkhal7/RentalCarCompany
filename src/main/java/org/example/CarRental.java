package org.example;

import java.util.Scanner;

public class CarRental {
    static Scanner input = new Scanner(System.in);

    // veriables

    public String date;
    public int days;
    public int age;
    public boolean tollTag;
    public boolean GPS;
    public boolean roadside;
    public double basicRental = 29.99;
    public double addDaily = 0;
    public double total;

    // promp user
     public void pickUpDate(){
         System.out.println("welcome to Car Rental Company! ");
         System.out.println("Enter your Pick up date ( mm/dd/yyyy)");
            this.date = input.nextLine();
            input.nextLine();

     }
     public void rentalDays(){
         System.out.println("How many days is the rental for? ");
         this.days = input.nextInt();
         input.nextLine();
     }
     public void getOptions(){
         System.out.println("Do you want an electronic toll tag? ($3.95/day) (yes/no): ");
         this.tollTag = input.nextLine().equalsIgnoreCase("yes");

         System.out.print("Do you want GPS? ($2.95/day) (yes/no): ");
         this.GPS = input.nextLine().equalsIgnoreCase("yes");

         System.out.print("Do you want roadside assistance? ($3.95/day) (yes/no): ");
         this.roadside = input.nextLine().equalsIgnoreCase("yes");
     }
     public void getAge(){
         System.out.print("Enter your age: ");
         this.age = input.nextInt();
     }
     public void calculateCost(){



         if (tollTag) {
             addDaily += 3.95;
         }

         if (GPS) {
             addDaily += 2.95;
         }

         if (roadside) {
             addDaily += 3.95;
         }



         total = (basicRental + addDaily) * days;

         // Apply young driver fee if under 25

         if (age < 25) {
             total *= 1.30;
         }

         // Show result
         System.out.println("\n----- RENTAL SUMMARY -----");
         System.out.println("Pickup date: " + date);
         System.out.println("Rental days: " + days);
         System.out.println("Electronic toll tag: " + (tollTag ? "Yes" : "No"));
         System.out.println("GPS: " + (GPS ? "Yes" : "No"));
         System.out.println("Roadside assistance: " + (roadside ? "Yes" : "No"));
         System.out.println("Driver age: " + age);
         System.out.printf("Total estimated cost: $%.2f\n", total);

     }





}
