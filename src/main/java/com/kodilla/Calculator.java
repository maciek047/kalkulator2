package com.kodilla;

public class Calculator {
    public int dodawanie(int x1, int x2) {
        return x1 + x2;
    }

    public int odejmowanie(int x1, int x2) {
        return x1 - x2;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println("Wynik dodawania: " + calculator.dodawanie(7,8));
    }
}

