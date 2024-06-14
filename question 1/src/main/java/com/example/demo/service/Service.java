package com.example.demo.service;

import java.util.ArrayList;

@Service
public class Service {
    private double average(ArrayList<Integer> numbers)
    {
        if(numbers.isEmpty())
        {
            return 0.0;
        }
        int sum=0;
        for(int number:numbers)
        {
            sum+=number;
        }
        double avg=(double)sum/numbers.size();
        return avg;
    }
}
