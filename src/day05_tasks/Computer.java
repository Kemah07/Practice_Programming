package day05_tasks;

public class Computer {
    public static void main(String[] args) {

    String brand, description, color, chip;
    short ramMemory, storageMemory;
    boolean hasMonitor, hasWifiCard, hasUsb3_0;
    double price;
    char numberOfMonitors, numberOfUsbSlots;

    brand = "MacBook Pro";
    description = "8-core CPU with 4 performance cores and 4 efficiency cores";
    color = "Space Gray";
    chip = "Apple M2";
    ramMemory = 8; //GB
    storageMemory = 512; //GB
    hasMonitor = true;
    hasWifiCard = true;
    hasUsb3_0 = true;
    price = 999.99;
    numberOfMonitors = '1';
    numberOfUsbSlots = '2';

        System.out.println("Brand:\t\t\t\t\t" + brand);
        System.out.println("Descripption:\t\t\t" + description);
        System.out.println("Color:\t\t\t\t\t" + color);
        System.out.println("Ram Memory:\t\t\t\t" + ramMemory + " GB");
        System.out.println("Storage Memory:\t\t\t" + storageMemory + " GB");
        System.out.println("Monitor:\t\t\t\t" + hasMonitor);
        System.out.println("Wifi Card:\t\t\t\t" + hasWifiCard);
        System.out.println("Usb 3.0:\t\t\t\t" + hasUsb3_0);
        System.out.println("Price:\t\t\t\t\t" + "$" + price);
        System.out.println("Number of Monitors:\t\t" + numberOfMonitors);
        System.out.println("Number of USB Slots\t\t" + numberOfUsbSlots);







    }
}
