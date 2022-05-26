package activities;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Om");
        myList.add("Omi");
        myList.add("Omni");
        myList.add("Ram");
        myList.add("Tom");
        System.out.println("Names are ");
        for(String name: myList){
            System.out.println(name);
        }

    }
}
