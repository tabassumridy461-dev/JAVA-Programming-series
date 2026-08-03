/* Spring 26
1.b)You are managing the inventory for a warehouse that tracks boxes of fruit. You need to handle incoming shipments and damaged goods. 
Program a main() method that performs the following operations:

1.Create an ArrayList called fruitStock and insert: Banana, Orange, Lychee, Mango, Apple.
2.A new shipment arrives. From index 2 onwards, insert: Pear, Grape, Date.
3.The warehouse manager realizes the Apple box is expired. Replace “Apple” with “Rotten Apple”.
4.The first three fruits from fruitStock list are loaded onto a delivery truck. Extract these three fruits, print them and then remove them from fruitStock.
5.Check if the list contains “Mango”. If it does, print its index; otherwise, print “Out of Stock”.
6.Display the first and last item in the fruitStock.
7.Display the size of the fruitStock and then clear the fruitStock. */

import java.util.ArrayList;
import java.util.Arrays;

public class FruitStock {

    public static void main(String[] args) {

        // Step 1: Create an ArrayList and add initial fruits
        ArrayList<String> fruitStock = new ArrayList<>();

        fruitStock.add("Banana");
        fruitStock.add("Orange");
        fruitStock.add("Lychee");
        fruitStock.add("Mango");
        fruitStock.add("Apple");

        System.out.println("Initial List:");
        System.out.println(fruitStock);

        // Step 2: Insert Pear, Grape and Date from index 2
        fruitStock.addAll(2, Arrays.asList("Pear", "Grape", "Date"));

        System.out.println("\nAfter New Shipment:");
        System.out.println(fruitStock);

        // Step 3: Replace Apple with Rotten Apple
        int appleIndex = fruitStock.indexOf("Apple");
        fruitStock.set(appleIndex, "Rotten Apple");

        System.out.println("\nAfter Replacing Apple:");
        System.out.println(fruitStock);

        // Step 4: Take first three fruits for delivery
        ArrayList<String> deliveryTruck =
                new ArrayList<>(fruitStock.subList(0, 3));

        System.out.println("\nFruits Loaded on Delivery Truck:");
        System.out.println(deliveryTruck);

        // Remove those three fruits from the original list
        fruitStock.removeAll(deliveryTruck);

        System.out.println("\nRemaining Fruits:");
        System.out.println(fruitStock);

        // Step 5: Check whether Mango exists
        if (fruitStock.contains("Mango")) {
            System.out.println("\nMango Found at Index: " + fruitStock.indexOf("Mango"));
        } else {
            System.out.println("\nOut of Stock");
        }

        // Step 6: Print first and last fruit
        System.out.println("\nFirst Fruit: " + fruitStock.get(0));
        System.out.println("Last Fruit: " + fruitStock.get(fruitStock.size() - 1));

        // Step 7: Print size and clear the list
        System.out.println("\nSize of List: " + fruitStock.size());

        fruitStock.clear();

        System.out.println("After Clearing List:");
        System.out.println(fruitStock);
    }
}

                              











                                
