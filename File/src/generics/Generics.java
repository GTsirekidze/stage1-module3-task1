package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public List <String> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<String> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    public <T> T genericMethod(T data) {
        return data;
    }

    public <T,G> void cloneMethod(List<T> consumer, List <G> producer) {
        consumer.addAll(producer);
    }

}