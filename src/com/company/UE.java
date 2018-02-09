package com.company;

import java.util.ArrayList;

public class UE {
    private ArrayList<String> ueMembers = new ArrayList<String>();

    public void addMember(String newMember){

        ueMembers.add(newMember);
    }
    public void showMembers(){
        System.out.println("UE has " + ueMembers.size() + " members.");
        for (int i = 0; i<ueMembers.size(); i++){
            System.out.println(i + ". " + ueMembers.get(i));
        }
    }
    public void modifyMembers(String oldMember, String newMember){

        int position = findMember(oldMember);
        if (position >=0){
            System.out.println(oldMember + " has been expelled, " + newMember + " become member of UE.");
            ueMembers.set(position,newMember);
        } else {
            System.out.println("There is no " + oldMember + " in UE.") ;
        }

    }
    public void removeMember(String oldMember){
        int position = findMember(oldMember);
        if (position>=0){
            ueMembers.remove(oldMember);
            System.out.println("By unanimous voting " + oldMember + " has been removed from Union.");
        } else {
            System.out.println(oldMember + " isn't member of union.");
        }
    }
    public boolean checkMember(String member){
        int position = ueMembers.indexOf(member);
        if(position>=0){
            return true;
        } else {
            return false;
        }
    }

    private int findMember(String member){
        return ueMembers.indexOf(member);
    }
}
