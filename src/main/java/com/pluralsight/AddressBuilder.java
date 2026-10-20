package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Full name: ");
        String fullName = myScanner.nextLine().trim();

        System.out.println("Billing Street: ");
        String billingStreet = myScanner.nextLine().trim();

        System.out.println("Billing City: ");
        String billingCity = myScanner.nextLine().trim();

        System.out.println("Billing State: ");
        String billingState = myScanner.nextLine().trim();

        System.out.println("Billing Zip: ");
        String billingZip = myScanner.nextLine().trim();

        System.out.println("Shipping Street: ");
        String shippingStreet = myScanner.nextLine().trim();

        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine().trim();

        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine().trim();

        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine().trim();

        StringBuilder address = new StringBuilder();

        address.append(fullName + "\n" + "\n");

        address.append("Billing address: \n" + billingStreet + "\n");

        address.append(billingCity + ", ");

        address.append(billingState + " ");

        address.append(billingZip + "\n" + "\n");

        address.append("Shipping address: \n" + shippingStreet + "\n");

        address.append(shippingCity + ", ");

        address.append(shippingState + " ");

        address.append(shippingZip + " ");

        String userAddress = address.toString();
        System.out.println(userAddress);
    }
}
