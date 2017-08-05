package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers){
        int counter = 0;
        List<Integer> evenList = new ArrayList<>();
        for(int i = 0; i <numbers.size(); i++) {
            counter = numbers.get(i);
            if(counter % 2 == 0) {
                evenList.add(counter);
            }
        }
        return evenList;
    }
}
