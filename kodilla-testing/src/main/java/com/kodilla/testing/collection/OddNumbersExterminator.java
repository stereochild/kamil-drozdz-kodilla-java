package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers){
        int counter = 0;
        List<Integer> oddList = new ArrayList<>();
        for(int i = 1; i <numbers.size(); i++) {
            counter = numbers.get(i);
            if(counter % 2 == 0) {
                oddList.add(counter);
                System.out.println(counter);
            }
        }
    }
}
