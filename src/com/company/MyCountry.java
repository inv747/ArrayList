package com.company;

import java.util.Scanner;

public class MyCountry {

    private static Scanner scanner = new Scanner(System.in);
    private static CommonwealthOfPoland commonwealthOfPoland = new CommonwealthOfPoland();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0 ;
        printPossibilities();
        while (!quit){
            System.out.println("Enter command");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printPossibilities();
                    break;
                case 1:
                    commonwealthOfPoland.showMyProvinces();
                    break;
                case 2:
                    addProvince();
                    break;
                case 3:
                    replaceProvinces();
                    break;
                case 4:
                    removeProvince();
                    break;
                case 5:
                    findProvince();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printPossibilities(){
        System.out.println("\nPress:");
        System.out.println("\t 0 - To print possible orders.");
        System.out.println("\t 1 - To print Commonwealth provinces.");
        System.out.println("\t 2 - To add province to Commonwealth.");
        System.out.println("\t 3 - To replace province for another.");
        System.out.println("\t 4 - To remove province.");
        System.out.println("\t 5 - To search from list of provinces.");
        System.out.println("\t 6 - To quit.");
    }
    public static void addProvince(){
        System.out.println("Enter province to add to our empire:");
        String province = scanner.nextLine();
        commonwealthOfPoland.addProvinceToState(province);
    }
    public static void replaceProvinces(){
        System.out.println("Enter province number:");
        int index = scanner.nextInt();
        System.out.println("Enter name of new province:");
        String newProvince = scanner.nextLine();
        commonwealthOfPoland.replaceProvince(index, newProvince);
    }
    public static void removeProvince(){
        System.out.println("Enter province to remove from Commonwealth:");
        String province = scanner.nextLine();
        commonwealthOfPoland.removeProvinceFromCommonwealth(province);
    }
    public static void findProvince(){
        System.out.println("Enter province you want find:");
        String province = scanner.nextLine();
        if (commonwealthOfPoland.findProvince(province) != null) {
            System.out.println("Found " + province + " in our kingdom.");
        }
        else{
            System.out.println(province + " is not in our kingdom.");
        }

    }

}
