package com.example.demo.model;

import java.util.List;
import java.util.Objects;

public class Calculator{
    private ArrayList<Integer> windowPrevState;
    private ArrayList<Integer> windowCurrState;
    private ArrayList<Integer> numbers;
    private double avg;

    public Calculator() {
    }

    public Calculator(ArrayList<Integer> windowPrevState, ArrayList<Integer> windowCurrState, ArrayList<Integer> numbers, double avg) {
        this.windowPrevState = windowPrevState;
        this.windowCurrState = windowCurrState;
        this.numbers = numbers;
        this.avg = avg;
    }

    public ArrayList<Integer> getWindowPrevState() {
        return this.windowPrevState;
    }

    public void setWindowPrevState(ArrayList<Integer> windowPrevState) {
        this.windowPrevState = windowPrevState;
    }

    public ArrayList<Integer> getWindowCurrState() {
        return this.windowCurrState;
    }

    public void setWindowCurrState(ArrayList<Integer> windowCurrState) {
        this.windowCurrState = windowCurrState;
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Calculator windowPrevState(ArrayList<Integer> windowPrevState) {
        setWindowPrevState(windowPrevState);
        return this;
    }

    public Calculator windowCurrState(ArrayList<Integer> windowCurrState) {
        setWindowCurrState(windowCurrState);
        return this;
    }

    public Calculator numbers(ArrayList<Integer> numbers) {
        setNumbers(numbers);
        return this;
    }

    public Calculator avg(double avg) {
        setAvg(avg);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Calculator)) {
            return false;
        }
        Calculator calculator = (Calculator) o;
        return Objects.equals(windowPrevState, calculator.windowPrevState) && Objects.equals(windowCurrState, calculator.windowCurrState) && Objects.equals(numbers, calculator.numbers) && avg == calculator.avg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(windowPrevState, windowCurrState, numbers, avg);
    }

    @Override
    public String toString() {
        return "{" +
            " windowPrevState='" + getWindowPrevState() + "'" +
            ", windowCurrState='" + getWindowCurrState() + "'" +
            ", numbers='" + getNumbers() + "'" +
            ", avg='" + getAvg() + "'" +
            "}";
    }

}