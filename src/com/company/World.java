package com.company;

import java.util.Scanner;

public class World {
    public static Scanner scanner = new Scanner(System.in);
    public static UE ue = new UE();

    public static void main(String[] args){


    boolean flag = true;
    int choice = 0;
    printInstruction();
        while (flag){
            System.out.println("Enter code:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    ue.showMembers();
                    break;
                case 2:
                    addNewMember();
                    break;
                case 3:
                    modifyMember();
                    break;
                case 4:
                    removeMember();
                    break;
                case 5:
                    searchForMember();
                    break;
                case 6:
                    flag = false;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of UE members");
        System.out.println("\t 2 - To add new member to UE.");
        System.out.println("\t 3 - To modify members.");
        System.out.println("\t 4 - To remove members from UE.");
        System.out.println("\t 5 - To search for member.");
        System.out.println("\t 6 - To quit meeting.");
    }
    public static void addNewMember(){
        System.out.println("Enter new country to the union:");
        String newMember = scanner.nextLine();
        ue.addMember(newMember);
    }
    public static void modifyMember(){
        System.out.println("Enter country to remove:");
        String oldMember = scanner.nextLine();
        System.out.println("Enter new country on old place:");
        String newMember = scanner.nextLine();
        ue.modifyMembers(oldMember,newMember);
    }
    public static void removeMember(){
        System.out.println("Enter country to remove:");
        String oldMember = scanner.nextLine();
        ue.removeMember(oldMember);
    }
    public static void searchForMember(){
        System.out.println("Enter searched country:");
        String searchedCountry = scanner.nextLine();
        ue.checkMember(searchedCountry);
    }
}
