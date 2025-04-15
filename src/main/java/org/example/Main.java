package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarRental rental = new CarRental();

        rental.pickUpDate();
        rental.rentalDays();
        rental.getOptions();
        rental.getAge();
        rental.calculateCost();

 }
}