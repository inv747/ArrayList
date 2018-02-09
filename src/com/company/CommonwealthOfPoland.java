package com.company;

import java.util.ArrayList;

public class CommonwealthOfPoland {
    private ArrayList<String> commonwealthOfPoland = new ArrayList<String>();

    public void addProvinceToState(String province){
        commonwealthOfPoland.add(province);
    }
    public void showMyProvinces(){
        System.out.println("Commonwealth have " + commonwealthOfPoland.size() + " provinces.");
        for (int i = 0; i<commonwealthOfPoland.size(); i++){
            System.out.println(i + ". "+ commonwealthOfPoland.get(i));
        }
    }
    public void replaceProvince(int position, String province){
        String oldProvince = commonwealthOfPoland.get(position);
        commonwealthOfPoland.set(position, province);
        System.out.println("Province " + oldProvince + " has been replace to " + commonwealthOfPoland.get(position));
    }
    public void removeProvinceFromCommonwealth(String province){
        int index = commonwealthOfPoland.indexOf(province);
        if (index <= 0 ) {
            commonwealthOfPoland.remove(index);
        }else {
            System.out.println("There is no province " + province);
        }

    }
    public String findProvince(String province){
        int position = commonwealthOfPoland.indexOf(province);
        if (position <= 0){
            return commonwealthOfPoland.get(position);
        }
        return null;
    }
}
